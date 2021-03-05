package com.cc.janus.schema.enuminfo;

public enum DataType {
    Byte(java.lang.Byte.class), Short(java.lang.Short.class), Char(java.lang.Character.class),

    Integer(java.lang.Integer.class), Long(java.lang.Long.class), Float(java.lang.Float.class),

    Double(java.lang.Double.class), Boolean(java.lang.Boolean.class), String(java.lang.String.class),

    Enum(java.lang.Enum.class), Class(java.lang.Class.class), NULL(null);

    private Class<?> clazz;

    private DataType(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Class<?> getClazz() {
        return clazz;
    }
}
