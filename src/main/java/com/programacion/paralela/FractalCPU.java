package com.programacion.paralela;

public class FractalCPU {
    public int[] pixel_buffer;

    public FractalCPU() {
        pixel_buffer = new int[FractalParams.WIDTH*FractalParams.HEIGHT];
    }

    int acotado_2(double x, double y) {

        int iter = 1;
        double zr = x;
        double zi = y;

        while (iter<FractalParams.max_iteraciones && (zr*zr + zi*zi)<4.0) {

            double dr = zr*zr - zi*zi + FractalParams.cReal;
            double di = 2.0*zr*zi + FractalParams.cImag;
            zr = dr;
            zi = di;

            iter++;
        }

        if (iter<FractalParams.max_iteraciones) {
            // la norma es mayor que 2
            //return 0xFF0000FF; // color rojo
            int index = iter % FractalParams.PALETTE_SIZE;
            return FractalParams.color_ramp[index];
        }

        return 0xFF000000; // color negreo


    }

    void julia_serial_2(double xMin, double yMin, double xMax, double yMax, int width, int height) {
        double dx = (xMax - xMin) / width;
        double dy = (yMax - yMin) / height;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // z = x+yi - (x, y)
                double x = xMin + i * dx;
                double y = yMax - j * dy;

                var color = acotado_2(x, y);

                pixel_buffer[j * width + i] = color; // La textura es unidimensional
            }

        }
    }
}
