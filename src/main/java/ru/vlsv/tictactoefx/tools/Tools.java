package ru.vlsv.tictactoefx.tools;

/**
 * @author : Anatoly Lebedev
 * @version : 1.0.0 14.12.2021
 * @link : https://github.com/Centnerman
 **/

public class Tools {

    public static int randomInt(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
