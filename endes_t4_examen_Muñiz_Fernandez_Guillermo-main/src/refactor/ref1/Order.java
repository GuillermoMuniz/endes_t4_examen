package refactor.ref1;
/*
Tarea: Refactorizar el método processOrder para utilizar un objeto
de parámetro que contenga itemName, quantity, price, y customerName.
 */


class Order {
    {
        class ProcessOrder {
            private String itemName;
            private int quantity;
            private double price;
            private String customerName;

            public ProcessOrder(String itemName, int quantity, double price, String customerName) {
                this.itemName = itemName;
                this.quantity = quantity;
                this.price = price;
                this.customerName = customerName;
            }


            public String getItemName() {
                return itemName;
            }

            public int getQuantity() {
                return quantity;
            }

            public double getPrice() {
                return price;
            }

            public String getCustomerName() {
                return customerName;
            }
        }

    }
    }



