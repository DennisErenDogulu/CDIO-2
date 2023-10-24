public class Player {
        private String name;
        private int balance;

        public Player(String name, int initialBalance) {
            this.name = name;
            this.balance = initialBalance;
        }

        public String getName() {
            return name;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int newBalance) {
            balance = newBalance;
        }

        public void deposit(int amount) {
        }
    }

