package com.company.oop.dynamicarrayobject2;

/**
 * Created by Mike on 31.03.2016.
 */
public abstract class ObjectArray {
    private Object[] objects;

    public ObjectArray() {
        this(0);
    }

    public ObjectArray(int size) {
        objects = new Object[size];
    }

    protected Object[] getObjects() {
        return objects;
    }

    public Object getObject(int index) {
        //make special 'index - 1' because it starts from 0
        //with 'index - 1' I can pass getObject(5) for 5 elements
        //compare with case when only 'index' and it raises on getObject(5) ArrayIndexOutOfBoundsException
        //and off course id's starts from 1, it is native for simpleUser
        return objects[index];
    }

    public int size() {
        return objects.length;
    }

    public ObjectArray add(Object o) {
        Object[] objects1 = new Object[objects.length + 1];

        for (int i = 0; i < objects.length; i++) {
            objects1[i] = objects[i];
        }
        objects1[objects1.length - 1] = o;

        objects = objects1;
        return this;

    }

    public ObjectArray delete(int index) {
        Object[] objects1 = new Object[objects.length - 1];
        int index1 = 0;

        if (index > objects1.length) {
            return this;
        } else {
            for (int i = 0; i < objects.length; i++) {
                if (i != index) {
                    objects1[index1] = objects[i];
                    index1++;
                }
            }

        }

        objects = objects1;
        return this;


    }

    public abstract void printArray();
}


