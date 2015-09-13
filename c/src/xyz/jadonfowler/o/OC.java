package xyz.jadonfowler.o;

class OC {
    public native String parse(Character c);

    static { System.loadLibrary("o2-j"); }
}
