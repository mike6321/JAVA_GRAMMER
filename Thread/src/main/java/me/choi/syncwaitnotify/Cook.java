package me.choi.syncwaitnotify;

public class Cook implements Runnable{
    private Table table;

    public Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            int idx = (int) (Math.random()*table.dishNum());
            table.add(table.dishesName[idx]);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}
