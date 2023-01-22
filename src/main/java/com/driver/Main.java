package com.driver;

public class Main
{
    public class Product
    {
        public int Product(int x, int y) {
            return x*y;
        }


        public int Product(int x, int y, int z) {
            return x*y*z;
        }

        public double Product(double x, double y) {
            return x*y;
        }
    }

public void main(String[] args)
{
    Product p = new Product();
    p.Product(10, 20);
    p.Product(10, 20, 30);
    p.Product(10.5, 20.5);
}

 }