/*******************************************************************************
 * Copyright (c) 2015 Thomas Slusny.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package io.nondev.nonlua;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public final class LuaUtils {
    public static Number convertNumber(Double db, Class retType) {
        if (retType.isPrimitive()) {
            if (retType == Integer.TYPE) {
                return Integer.valueOf(db.intValue());
            } else if (retType == Float.TYPE) {
                return Float.valueOf(db.floatValue());
            } else if (retType == Double.TYPE) {
                return db;
            } else if (retType == Byte.TYPE) {
                return Byte.valueOf(db.byteValue());
            } else if (retType == Long.TYPE) {
                return Long.valueOf(db.longValue());
            } else if (retType == Short.TYPE) {
                return Short.valueOf(db.shortValue());
            }
        } else {
            if (retType.isAssignableFrom(Integer.class)) {
                return Integer.valueOf(db.intValue());
            } else if (retType.isAssignableFrom(Float.class)) {
                return Float.valueOf(db.floatValue());
            } else if (retType.isAssignableFrom(Double.class)) {
                return db;
            } else if (retType.isAssignableFrom(Byte.class)) {
                return Byte.valueOf(db.byteValue());
            } else if (retType.isAssignableFrom(Long.class)) {
                return Long.valueOf(db.longValue());
            } else if (retType.isAssignableFrom(Short.class)) {
                return Short.valueOf(db.shortValue());
            }
        }
    
        return null;    
    }
}