/* Licensed under Apache-2.0 */
package com.ing.eventbus.connect.schema.converters;

import org.apache.kafka.connect.data.Schema;

public class ConnectSchemaUtil {
    public static boolean isBytesSchema(Schema connectSchema) {
        if (connectSchema == null) {
            return false;
        }
        return connectSchema.type() == Schema.BYTES_SCHEMA.type() ||
                connectSchema.type() == Schema.OPTIONAL_BYTES_SCHEMA.type();
    }
}
