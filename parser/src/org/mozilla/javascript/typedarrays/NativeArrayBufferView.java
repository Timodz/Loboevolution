package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Undefined;

public abstract class NativeArrayBufferView
    extends IdScriptableObject
{
    private static final long serialVersionUID = 6884475582973958419L;

    /** Many view objects can share the same backing array */
    protected final NativeArrayBuffer arrayBuffer;
    /** The offset, in bytes, from the start of the backing array */
    protected final int offset;
    /** The length, in bytes, of the portion of the backing array that we use */
    protected final int byteLength;

    public NativeArrayBufferView()
    {
        arrayBuffer = NativeArrayBuffer.EMPTY_BUFFER;
        offset = 0;
        byteLength = 0;
    }

    protected NativeArrayBufferView(NativeArrayBuffer ab, int offset, int byteLength)
    {
        this.offset = offset;
        this.byteLength = byteLength;
        this.arrayBuffer = ab;
    }

    protected static boolean isArg(Object[] args, int i)
    {
        return ((args.length > i) && !Undefined.instance.equals(args[i]));
    }

    // Property dispatcher

    @Override
    protected int getMaxInstanceId()
    {
        return MAX_INSTANCE_ID;
    }

    @Override
    protected String getInstanceIdName(int id)
    {
        switch (id) {
        case Id_buffer: return "buffer";
        case Id_byteOffset: return "byteOffset";
        case Id_byteLength: return "byteLength";
        default: return super.getInstanceIdName(id);
        }
    }

    @Override
    protected Object getInstanceIdValue(int id)
    {
        switch (id) {
        case Id_buffer:
            return arrayBuffer;
        case Id_byteOffset:
            return ScriptRuntime.wrapInt(offset);
        case Id_byteLength:
            return ScriptRuntime.wrapInt(byteLength);
        default:
            return super.getInstanceIdValue(id);
        }
    }

// #string_id_map#

    @Override
    protected int findInstanceIdInfo(String s)
    {
        int id;
// #generated# Last update: 2014-12-08 17:32:09 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==6) { X="buffer";id=Id_buffer; }
            else if (s_length==10) {
                c=s.charAt(4);
                if (c=='L') { X="byteLength";id=Id_byteLength; }
                else if (c=='O') { X="byteOffset";id=Id_byteOffset; }
            }
            if (X!=null && X!=s && !X.equals(s)) id = 0;
            break L0;
        }
// #/generated#
        if (id == 0) {
            return super.findInstanceIdInfo(s);
        }
        return instanceIdInfo(READONLY | PERMANENT, id);
    }

    private static final int
        Id_buffer               = 1,
        Id_byteOffset           = 2,
        Id_byteLength           = 3,
        MAX_INSTANCE_ID         = Id_byteLength;

// #/string_id_map#
}
