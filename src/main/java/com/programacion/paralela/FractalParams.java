package com.programacion.paralela;

public class FractalParams {
    public static int max_iteraciones = 10;

    public static final double cReal = -0.7;

    public static final double xMin = -1.5;
    public static final double xMax = 1.5;
    public static final double yMin = -1.0;
    public static final double yMax = 1.0;

    public static final int WIDTH = 1600;
    public static final int HEIGHT = 900;


    public static final double cImag = 0.27015;

    public static final int PALETTE_SIZE = 16;

    public static final int[] color_ramp = {
            (0xFF0000FF),  // Rojo puro
            (0xEE0011FF),
            (0xDD0022FF),
            (0xCC0033FF),
            (0xBB0044FF),
            (0xAA0055FF),
            (0x990066FF),
            (0x880077FF),
            (0x770088FF),
            (0x660099FF),
            (0x5500AAFF),
            (0x4400BBFF),
            (0x3300CCFF),
            (0x2200DDFF),
            (0x1100EEFF),
            (0x0000FFFF)
    };
}
