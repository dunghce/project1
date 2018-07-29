
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class ATM {

    String ID;
    int balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ID: ");
        ID = sc.nextLine();
        System.out.println("nhap so du: ");
        balance = sc.nextInt();
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void display() {
        System.out.println("so du con lai la " + balance);
    }

    public static void main(String[] args) {
        int a;
        ATM m = new ATM();
        m.input();
        Scanner s = new Scanner(System.in);
        System.out.println("nhap so tien rut: ");
        a = s.nextInt();
        m.withdraw(a);
        m.display();

    }
}
