package com.paysera.sdk.wallet.moshi.adapters;

import com.squareup.moshi.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;

import static java.util.Collections.emptyList;

public class NullToEmptyListAdapter extends JsonAdapter<List<?>> {
    public static final Factory Factory = new JsonAdapter.Factory() {

        @Override
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
            if (!annotations.isEmpty()) {
                return null;
            }
            if (Types.getRawType(type) != List.class) {
                return null;
            }
            JsonAdapter<List<?>> objectJsonAdapter = moshi.nextAdapter(this, type, annotations);
            return new NullToEmptyListAdapter(objectJsonAdapter);
        }
    };

    final JsonAdapter<List<?>> adapter;

    NullToEmptyListAdapter(JsonAdapter<List<?>> delegate) {
        this.adapter = delegate;
    }

    @Override public List<?> fromJson(JsonReader reader) throws IOException {
        if (reader.peek() == JsonReader.Token.NULL) {
            reader.skipValue();
            return emptyList();
        }
        return adapter.fromJson(reader);
    }

    @Override public void toJson(JsonWriter writer, List<?> value) throws IOException {
        if (value == null) {
            throw new IllegalStateException("Wrap JsonAdapter with .nullSafe().");
        }
        adapter.toJson(writer, value);
    }
}
