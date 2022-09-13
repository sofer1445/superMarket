import javax.swing.*;
import java.awt.*;

public class TheShop extends JPanel {
    private ImageIcon imageIcon;
    private String typeOfProduct;
    private JComboBox<String> categories;
    private JButton soap;
    private JButton shampoo;
    private JButton paperToilet;
    private JLabel title;
    private JButton milk;
    private JButton cheese;
    private JButton yogurt;
    private JButton pasta;
    private JButton rice;
    private JButton quinoa;
    private JButton whiteBread;
    private JButton slicedBread;
    private JButton lightBread;
    private JButton apple;
    private JButton banana;
    private JButton orange;
    private JButton tomato;
    private JButton cucumber;
    private JButton lettuce;
    private JButton hamburger;
    private JButton chickenBreast;
    private JButton schnitzel;
    private JButton sugar;
    private JButton salt;
    private JButton oliveOil;

    public TheShop(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        this.imageIcon = new ImageIcon("image21.jpg");
        this.add(new JLabel(imageIcon));
        listOfCategories();
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.imageIcon.paintIcon(this, graphics, 0, 0);
    }

    public void listOfCategories() {
        this.categories = new JComboBox<>(new String[]{"All", "Cleaners", "Milk products", "Grains", "Types of breads", "Fruit", "Vegetables", "Meat", "Other"});
        categories.setBounds(Final.CATEGORIES_X, Final.CATEGORIES_Y, Final.CATEGORIES_WIDTH, Final.CATEGORIES_HEIGHT);
        categories.setFont(new Font("Serif", Font.BOLD, 20));
        this.title = new JLabel("Product list available for purchase, please select a product");
        title.setBounds(Final.TITLE_X, Final.TITLE_Y, Final.TITLE_WIDTH, Final.TITLE_HEIGHT);
        title.setFont(new Font("Serif", Font.ITALIC, 18));
        this.add(title);
        categories.setForeground(Color.BLUE);
        this.add(categories);
        categories.addActionListener(e -> {
            this.typeOfProduct = (String) categories.getSelectedItem();
            choiceOfOptions(typeOfProduct);
        });

    }

    public void cleaners() {
        System.out.println("cleaners");
        remove();
        this.soap = new JButton("Soap");
        soap.setBounds(Final.SOAP_X, Final.SOAP_Y, Final.SOAP_WIDTH, Final.SOAP_HEIGHT);
        soap.setFont(new Font("Serif", Font.BOLD, 15));
        soap.setForeground(Color.BLACK);
        this.add(soap);
        soap.addActionListener(e -> {
            try {
                System.out.println("Soap");

            } catch (Exception e1) {
                System.out.println("Soap error");
            }


        });
        this.shampoo = new JButton("Shampoo");
        shampoo.setBounds(Final.SHAMPOO_X, Final.SHAMPOO_Y, Final.SHAMPOO_WIDTH, Final.SHAMPOO_HEIGHT);
        shampoo.setFont(new Font("Serif", Font.BOLD, 15));
        shampoo.setForeground(Color.BLACK);
        this.add(shampoo);
        shampoo.addActionListener(e -> {
            try {
                System.out.println("Shampoo");

            } catch (Exception e1) {
                System.out.println("Shampoo error");
            }

        });
        this.paperToilet = new JButton("Paper toilet");
        paperToilet.setBounds(Final.PAPER_TOILET_X, Final.PAPER_TOILET_Y, Final.PAPER_TOILET_WIDTH, Final.PAPER_TOILET_HEIGHT);
        paperToilet.setFont(new Font("Serif", Font.BOLD, 15));
        paperToilet.setForeground(Color.BLACK);
        this.add(paperToilet);
        paperToilet.addActionListener(e -> {
            try {
                System.out.println("Paper toilet");

            } catch (Exception e1) {
                System.out.println("Paper toilet error");
            }

        });
        this.repaint();
    }

    public void milkProducts() {
        System.out.println("milk products");
        remove();
        this.milk = new JButton("Milk");
        milk.setBounds(Final.MILK_X, Final.MILK_Y, Final.MILK_WIDTH, Final.MILK_HEIGHT);
        milk.setFont(new Font("Serif", Font.BOLD, 15));
        milk.setForeground(Color.BLACK);
        this.add(milk);
        milk.addActionListener(e -> {
            try {
                System.out.println("Milk");

            } catch (Exception e1) {
                System.out.println("Milk error");
            }

        });
        this.cheese = new JButton("Cheese");
        cheese.setBounds(Final.CHEESE_X, Final.CHEESE_Y, Final.CHEESE_WIDTH, Final.CHEESE_HEIGHT);
        cheese.setFont(new Font("Serif", Font.BOLD, 15));
        cheese.setForeground(Color.BLACK);
        this.add(cheese);
        cheese.addActionListener(e -> {
            try {
                System.out.println("Cheese");

            } catch (Exception e1) {
                System.out.println("Cheese error");
            }

        });
        this.yogurt = new JButton("Yogurt");
        yogurt.setBounds(Final.YOGURT_X, Final.YOGURT_Y, Final.YOGURT_WIDTH, Final.YOGURT_HEIGHT);
        yogurt.setFont(new Font("Serif", Font.BOLD, 15));
        yogurt.setForeground(Color.BLACK);
        this.add(yogurt);
        yogurt.addActionListener(e -> {
            try {
                System.out.println("Yogurt");

            } catch (Exception e1) {
                System.out.println("Yogurt error");
            }

        });
        this.repaint();
    }

    public void grains() {
        System.out.println("grains");
        remove();
        this.rice = new JButton("Rice");
        rice.setBounds(Final.RICE_X, Final.RICE_Y, Final.RICE_WIDTH, Final.RICE_HEIGHT);
        rice.setFont(new Font("Serif", Font.BOLD, 15));
        rice.setForeground(Color.BLACK);
        this.add(rice);
        rice.addActionListener(e -> {
            try {
                System.out.println("Rice");

            } catch (Exception e1) {
                System.out.println("Rice error");
            }

        });
        this.pasta = new JButton("Pasta");
        pasta.setBounds(Final.PASTA_X, Final.PASTA_Y, Final.PASTA_WIDTH, Final.PASTA_HEIGHT);
        pasta.setFont(new Font("Serif", Font.BOLD, 15));
        pasta.setForeground(Color.BLACK);
        this.add(pasta);
        pasta.addActionListener(e -> {
            try {
                System.out.println("Pasta");

            } catch (Exception e1) {
                System.out.println("Pasta error");
            }

        });
        this.quinoa = new JButton("Quinoa");
        quinoa.setBounds(Final.QUINOA_X, Final.QUINOA_Y, Final.QUINOA_WIDTH, Final.QUINOA_HEIGHT);
        quinoa.setFont(new Font("Serif", Font.BOLD, 15));
        quinoa.setForeground(Color.BLACK);
        this.add(quinoa);
        quinoa.addActionListener(e -> {
            try {
                System.out.println("Quinoa");

            } catch (Exception e1) {
                System.out.println("Quinoa error");
            }

        });
        this.repaint();
    }

    public void typesOfBreads() {
        System.out.println("types of breads");
        remove();
        this.whiteBread = new JButton("White bread");
        whiteBread.setBounds(Final.WHITE_BREAD_X, Final.WHITE_BREAD_Y, Final.WHITE_BREAD_WIDTH, Final.WHITE_BREAD_HEIGHT);
        whiteBread.setFont(new Font("Serif", Font.BOLD, 15));
        whiteBread.setForeground(Color.BLACK);
        this.add(whiteBread);
        whiteBread.addActionListener(e -> {
            try {
                System.out.println("White bread");

            } catch (Exception e1) {
                System.out.println("White bread error");
            }

        });
        this.slicedBread = new JButton("Sliced bread");
        slicedBread.setBounds(Final.SLICED_BREAD_X, Final.SLICED_BREAD_Y, Final.SLICED_BREAD_WIDTH, Final.SLICED_BREAD_HEIGHT);
        slicedBread.setFont(new Font("Serif", Font.BOLD, 15));
        slicedBread.setForeground(Color.BLACK);
        this.add(slicedBread);
        slicedBread.addActionListener(e -> {
            try {
                System.out.println("Sliced bread");

            } catch (Exception e1) {
                System.out.println("Sliced bread error");
            }

        });
        this.lightBread = new JButton("Light bread");
        lightBread.setBounds(Final.LIGHT_BREAD_X, Final.LIGHT_BREAD_Y, Final.LIGHT_BREAD_WIDTH, Final.LIGHT_BREAD_HEIGHT);
        lightBread.setFont(new Font("Serif", Font.BOLD, 15));
        lightBread.setForeground(Color.BLACK);
        this.add(lightBread);
        lightBread.addActionListener(e -> {
            try {
                System.out.println("Light bread");

            } catch (Exception e1) {
                System.out.println("Light bread error");
            }

        });
        this.repaint();
    }

    public void fruit() {
        System.out.println("fruit");
        remove();
        this.apple = new JButton("Apple");
        apple.setBounds(Final.APPLE_X, Final.APPLE_Y, Final.APPLE_WIDTH, Final.APPLE_HEIGHT);
        apple.setFont(new Font("Serif", Font.BOLD, 15));
        apple.setForeground(Color.BLACK);
        this.add(apple);
        apple.addActionListener(e -> {
            try {
                System.out.println("Apple");

            } catch (Exception e1) {
                System.out.println("Apple error");
            }

        });
        this.orange = new JButton("Orange");
        orange.setBounds(Final.ORANGE_X, Final.ORANGE_Y, Final.ORANGE_WIDTH, Final.ORANGE_HEIGHT);
        orange.setFont(new Font("Serif", Font.BOLD, 15));
        orange.setForeground(Color.BLACK);
        this.add(orange);
        orange.addActionListener(e -> {
            try {
                System.out.println("Orange");

            } catch (Exception e1) {
                System.out.println("Orange error");
            }

        });
        this.banana = new JButton("Banana");
        banana.setBounds(Final.BANANA_X, Final.BANANA_Y, Final.BANANA_WIDTH, Final.BANANA_HEIGHT);
        banana.setFont(new Font("Serif", Font.BOLD, 15));
        banana.setForeground(Color.BLACK);
        this.add(banana);
        banana.addActionListener(e -> {
            try {
                System.out.println("Banana");

            } catch (Exception e1) {
                System.out.println("Banana error");
            }

        });
        this.repaint();
    }

    public void vegetables() {
        System.out.println("vegetables");
        remove();
        this.tomato = new JButton("Tomato");
        tomato.setBounds(Final.TOMATO_X, Final.TOMATO_Y, Final.TOMATO_WIDTH, Final.TOMATO_HEIGHT);
        tomato.setFont(new Font("Serif", Font.BOLD, 15));
        tomato.setForeground(Color.BLACK);
        this.add(tomato);
        tomato.addActionListener(e -> {
            try {
                System.out.println("Tomato");

            } catch (Exception e1) {
                System.out.println("Tomato error");
            }

        });
        this.cucumber = new JButton("Cucumber");
        cucumber.setBounds(Final.CUCUMBER_X, Final.CUCUMBER_Y, Final.CUCUMBER_WIDTH, Final.CUCUMBER_HEIGHT);
        cucumber.setFont(new Font("Serif", Font.BOLD, 15));
        cucumber.setForeground(Color.BLACK);
        this.add(cucumber);
        cucumber.addActionListener(e -> {
            try {
                System.out.println("Cucumber");

            } catch (Exception e1) {
                System.out.println("Cucumber error");
            }

        });
        this.lettuce = new JButton("Lettuce");
        lettuce.setBounds(Final.LETTUCE_X, Final.LETTUCE_Y, Final.LETTUCE_WIDTH, Final.LETTUCE_HEIGHT);
        lettuce.setFont(new Font("Serif", Font.BOLD, 15));
        lettuce.setForeground(Color.BLACK);
        this.add(lettuce);
        lettuce.addActionListener(e -> {
            try {
                System.out.println("Lettuce");

            } catch (Exception e1) {
                System.out.println("Lettuce error");
            }

        });
        this.repaint();
    }

    public void meat() {
        System.out.println("meat");
        remove();
        this.hamburger = new JButton("Hamburger");
        hamburger.setBounds(Final.HAMBURGER_X, Final.HAMBURGER_Y, Final.HAMBURGER_WIDTH, Final.HAMBURGER_HEIGHT);
        hamburger.setFont(new Font("Serif", Font.BOLD, 15));
        hamburger.setForeground(Color.BLACK);
        this.add(hamburger);
        hamburger.addActionListener(e -> {
            try {
                System.out.println("Hamburger");

            } catch (Exception e1) {
                System.out.println("Hamburger error");
            }

        });
        this.chickenBreast = new JButton("Chicken breast");
        chickenBreast.setBounds(Final.CHICKEN_BREAST_X, Final.CHICKEN_BREAST_Y, Final.CHICKEN_BREAST_WIDTH, Final.CHICKEN_BREAST_HEIGHT);
        chickenBreast.setFont(new Font("Serif", Font.BOLD, 15));
        chickenBreast.setForeground(Color.BLACK);
        this.add(chickenBreast);
        chickenBreast.addActionListener(e -> {
            try {
                System.out.println("Chicken breast");

            } catch (Exception e1) {
                System.out.println("Chicken breast error");
            }

        });
        this.schnitzel = new JButton("Schnitzel");
        schnitzel.setBounds(Final.SCHNITZEL_X, Final.SCHNITZEL_Y, Final.SCHNITZEL_WIDTH, Final.SCHNITZEL_HEIGHT);
        schnitzel.setFont(new Font("Serif", Font.BOLD, 15));
        schnitzel.setForeground(Color.BLACK);
        this.add(schnitzel);
        schnitzel.addActionListener(e -> {
            try {
                System.out.println("Schnitzel");

            } catch (Exception e1) {
                System.out.println("Schnitzel error");
            }

        });
        this.repaint();
    }

    public void other() {
        System.out.println("other");
        remove();
        this.sugar = new JButton("Sugar");
        sugar.setBounds(Final.SUGAR_X, Final.SUGAR_Y, Final.SUGAR_WIDTH, Final.SUGAR_HEIGHT);
        sugar.setFont(new Font("Serif", Font.BOLD, 15));
        sugar.setForeground(Color.BLACK);
        this.add(sugar);
        sugar.addActionListener(e -> {
            try {
                System.out.println("Sugar");

            } catch (Exception e1) {
                System.out.println("Sugar error");
            }

        });
        this.salt = new JButton("Salt");
        salt.setBounds(Final.SALT_X, Final.SALT_Y, Final.SALT_WIDTH, Final.SALT_HEIGHT);
        salt.setFont(new Font("Serif", Font.BOLD, 15));
        salt.setForeground(Color.BLACK);
        this.add(salt);
        salt.addActionListener(e -> {
            try {
                System.out.println("Salt");

            } catch (Exception e1) {
                System.out.println("Salt error");
            }

        });
        this.oliveOil = new JButton("Olive oil");
        oliveOil.setBounds(Final.OLIVE_OIL_X, Final.OLIVE_OIL_Y, Final.OLIVE_OIL_WIDTH, Final.OLIVE_OIL_HEIGHT);
        oliveOil.setFont(new Font("Serif", Font.BOLD, 15));
        oliveOil.setForeground(Color.BLACK);
        this.add(oliveOil);
        oliveOil.addActionListener(e -> {
            try {
                System.out.println("Olive oil");

            } catch (Exception e1) {
                System.out.println("Olive oil error");
            }

        });
        this.repaint();
    }

    public void choiceOfOptions(String typeOfProduct) {
        System.out.println("choiceOfOptions : start");
        switch (typeOfProduct) {
            case "Cleaners":
                cleaners();
                break;
            case "Milk products":
                milkProducts();
                break;
            case "Grains":
                grains();
                break;
            case "Types of breads":
                typesOfBreads();
                break;
            case "Fruit":
                fruit();
                break;
            case "Vegetables":
                vegetables();
                break;
            case "Meat":
                meat();
                break;
            case "Other":
                other();
                break;
            case "All":
                all();
                break;
        }
    }public void remove() {
        System.out.println("remove : start");
        try {
            this.remove(soap);
            this.remove(shampoo);
            this.remove(paperToilet);
        } catch (Exception e) {
            System.out.println("remove : soap, shampoo, paperToilet");
        }
        try {
            this.remove(milk);
            this.remove(cheese);
            this.remove(yogurt);
        } catch (Exception e) {
            System.out.println("remove : milk, cheese, yogurt");
        }
        try{
        this.remove(rice);
        this.remove(pasta);
        this.remove(quinoa);
        }catch (Exception e){
            System.out.println("remove : rice, pasta, quinoa");
        }
        try{
        this.remove(whiteBread);
        this.remove(slicedBread);
        this.remove(lightBread);
        }catch (Exception e){
            System.out.println("remove : whiteBread, slicedBread, lightBread");
        }
        try{
        this.remove(apple);
        this.remove(orange);
        this.remove(banana);
        }catch (Exception e){
            System.out.println("remove : apple, orange, banana");
        }
        try {
        this.remove(tomato);
        this.remove(cucumber);
        this.remove(lettuce);
        }catch (Exception e){
            System.out.println("remove : tomato, cucumber, lettuce");
        }
        try{
        this.remove(hamburger);
        this.remove(chickenBreast);
        this.remove(schnitzel);
        }catch (Exception e){
            System.out.println("remove : hamburger, chickenBreast, schnitzel");
        }
        try{
        this.remove(sugar);
        this.remove(salt);
        this.remove(oliveOil);
        }catch (Exception e){
            System.out.println("remove : sugar, salt, oliveOil");
        }
        this.repaint();
    }
    public void all(){
        JComboBox<String> allPro = new JComboBox<>(new String[]{"List of all products","soap", "shampoo", "paperToilet", "milk", "cheese", "yogurt", "rice", "pasta", "quinoa", "whiteBread", "slicedBread", "lightBread", "apple", "orange", "banana", "tomato", "cucumber", "lettuce", "hamburger", "chickenBreast", "schnitzel", "sugar", "salt", "oliveOil"});
        allPro.setBounds(Final.ALL_X, Final.ALL_Y, Final.ALL_WIDTH, Final.ALL_HEIGHT);
        allPro.setFont(new Font("Serif", Font.BOLD, 15));
        allPro.setForeground(Color.BLACK);
        this.add(allPro);
        this.repaint();
    }
}


