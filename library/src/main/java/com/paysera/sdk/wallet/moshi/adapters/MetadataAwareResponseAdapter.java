package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.entities.Metadata;
import com.paysera.sdk.wallet.entities.MetadataAwareResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

public class MetadataAwareResponseAdapter<T> extends JsonAdapter<MetadataAwareResponse<T>> {

    public static final Factory Factory = new JsonAdapter.Factory() {
        @Override
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
            if (type instanceof ParameterizedType) {
                ParameterizedType paramType = (ParameterizedType) type;
                if (paramType.getRawType() != MetadataAwareResponse.class) return null;
                if (paramType.getActualTypeArguments().length != 1) return null;
                Type argType = paramType.getActualTypeArguments()[0];
                JsonAdapter adapter = moshi.adapter(argType);

                return new MetadataAwareResponseAdapter(moshi, adapter);
            } else {
                return null;
            }
        }
    };

    private Moshi moshi;
    private JsonAdapter<T> adapter;

    MetadataAwareResponseAdapter(Moshi moshi, JsonAdapter<T> adapter) {
        this.moshi = moshi;
        this.adapter = adapter;
    }

    @Override
    public MetadataAwareResponse<T> fromJson(JsonReader reader) throws IOException {
        MetadataAwareResponse<T> response = new MetadataAwareResponse<>();
        ArrayList<T> items = new ArrayList<>();
        Metadata metadata = null;

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("_metadata")) {
                metadata = moshi.adapter(Metadata.class).fromJson(reader);
            } else {
                reader.beginArray();
                while (reader.hasNext()) {
                    items.add(adapter.fromJson(reader));
                }
                reader.endArray();
            }
        }
        reader.endObject();

        response.setMetadata(metadata);
        response.setItems(items);

        return response;
    }

    @Override
    public void toJson(JsonWriter writer, MetadataAwareResponse<T> value) {
    }
}
