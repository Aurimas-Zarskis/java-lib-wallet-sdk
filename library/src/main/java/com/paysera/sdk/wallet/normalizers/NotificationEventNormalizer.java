package com.paysera.sdk.wallet.normalizers;

import com.paysera.sdk.wallet.entities.notification.NotificationEvent;
import com.paysera.sdk.wallet.exceptions.NormalizerException;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class NotificationEventNormalizer implements
    NormalizerInterface<NotificationEvent>,
    DenormalizerInterface<NotificationEvent>,
    ArrayNormalizerInterface<NotificationEvent>,
    ArrayDenormalizerInterface<NotificationEvent> {

    protected Moshi moshi;

    public NotificationEventNormalizer(Moshi moshi) {
        this.moshi = moshi;
    }

    public JSONObject mapFromEntity(NotificationEvent entity) throws NormalizerException {
        JSONObject data = new JSONObject();

        if (entity.getEventName() == null) {
            throw new NormalizerException("Event name is not specified");
        }

        if (entity.getObjectName() == null) {
            throw new NormalizerException("Object name is not specified");
        }

        data.put("event", entity.getEventName());
        data.put("object", entity.getObjectName());
        data.put("silent", entity.isSilent());
        data.put("android_channel", entity.getAndroidChannel());
        data.put("priority", entity.getPriority());

        if (entity.getParameters().size() > 0) {
            data.put("parameters", new JSONObject(entity.getParameters()));
        }

        return data;
    }

    public JSONArray mapFromEntity(List<NotificationEvent> entities) throws NormalizerException {
        JSONArray result = new JSONArray();

        for (NotificationEvent entity : entities) {
            result.put(this.mapFromEntity(entity));
        }

        return result;
    }

    public NotificationEvent mapToEntity(JSONObject data) throws IOException {
        Type type = Types.newParameterizedType(Map.class, String.class, Object.class);
        JsonAdapter<Map<String, Object>> hashMapAdapter = moshi.adapter(type);
        NotificationEvent event;
        try {
            event = new NotificationEvent(data.getString("object"), data.getString("event"));
        } catch (IllegalArgumentException exception) {
            event = new NotificationEvent(null, null);
        }

        event.setSilent(data.getBoolean("silent"));
        event.setAndroidChannel(data.getString("android_channel"));
        event.setPriority(data.getString("priority"));

        if (data.has("parameters")) {
            Map<String, Object> parameters = hashMapAdapter.fromJson(data.getJSONObject("parameters").toString());

            event.setParameters(parameters);
        }

        return event;
    }

    public List<NotificationEvent> mapToEntity(JSONArray data) throws IOException {
        List<NotificationEvent> events = new ArrayList<>();

        for (int i = 0; i < data.length(); ++i) {
            events.add(
                this.mapToEntity(data.getJSONObject(i))
            );
        }

        return events;
    }
}
