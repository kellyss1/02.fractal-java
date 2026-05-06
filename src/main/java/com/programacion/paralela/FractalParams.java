package com.programacion.paralela;

public class FractalParams {
    public static int max_iteraciones = 10;

    public static int WIDTH = 1600;
    public static int HEIGHT = 900;


    public static double xMin = -1.5;
    public static double xMax = 1.5;

    public static double yMin = -1.0;
    public static double yMax = 1.0;

    public static final double cReal = -0.7;
    public static final double cImag = 0.27015;

    public static final int PALETTE_SIZE = 16;

public static final int[] color_ramp = {
            0xFF000000,  // Negro
            0xFF000011,
            0xFF000022,
            0xFF000033,
            0xFF000044,
            0xFF000055,
            0xFF000066,
            0xFF000077,
            0xFF000088,
            0xFF000099,
            0xFF0000AA,
            0xFF0000BB,
            0xFF0000CC,
            0xFF0000DD,
            0xFF0000EE,
            0xFF0000FF   // Azul
    };
}
