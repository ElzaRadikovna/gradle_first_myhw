<<<<<<< HEAD
=======
 testing

 main
>>>>>>> 33765d589dc5a70a2924a305bea0a0a6b3febf36
package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}

