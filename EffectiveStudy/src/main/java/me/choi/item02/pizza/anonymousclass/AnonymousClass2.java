package me.choi.item02.pizza.anonymousclass;

public class AnonymousClass2 {

    Company company = new Company() {
        @Override
        public void CompanyInfo() {
            System.out.println("interface");
        }
    };
}
