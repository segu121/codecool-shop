package com.codecool.shop.config;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.SupplierDao;
import com.codecool.shop.dao.implementation.ProductCategoryDaoMem;
import com.codecool.shop.dao.implementation.ProductDaoMem;
import com.codecool.shop.dao.implementation.SupplierDaoMem;
import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.math.BigDecimal;

@WebListener
public class Initializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ProductDao productDataStore = ProductDaoMem.getInstance();
        ProductCategoryDao productCategoryDataStore = ProductCategoryDaoMem.getInstance();
        SupplierDao supplierDataStore = SupplierDaoMem.getInstance();

        //setting up a new supplier
        Supplier amazon = new Supplier("Amazon", "Digital content and services");
        supplierDataStore.add(amazon);
        Supplier lenovo = new Supplier("Lenovo", "Computers");
        supplierDataStore.add(lenovo);
        Supplier samsung = new Supplier("Samsung", "Computers, home appliances and electronics");
        supplierDataStore.add(samsung);
        //
        Supplier dell = new Supplier("Dell", "Computers");
        supplierDataStore.add(dell);
        Supplier hp = new Supplier("HP", "Computers");
        supplierDataStore.add(hp);
        Supplier asus = new Supplier("Asus", "Computers");
        supplierDataStore.add(asus);
        Supplier msi = new Supplier("MSI", "Computers");
        supplierDataStore.add(msi);
        Supplier lg = new Supplier("LG", "Computers, home appliances and electronics");
        supplierDataStore.add(lg);
        Supplier apple = new Supplier("Apple", "Computers, home appliances and electronics, smartphones, smartwatches");
        supplierDataStore.add(apple);
        Supplier huawei = new Supplier("Huawei", "Computers, smartphones, smartwatches");
        supplierDataStore.add(huawei);
        Supplier xiaomi = new Supplier("Xiaomi", "Computers, smartphones, smartwatches");
        supplierDataStore.add(xiaomi);


        //setting up a new product category
        ProductCategory tablet = new ProductCategory("Tablet", "Hardware", "A tablet computer, commonly shortened to tablet, is a thin, flat mobile computer with a touchscreen display.");
        productCategoryDataStore.add(tablet);
        ProductCategory monitor = new ProductCategory("Monitor", "Hardware", "Output device for direct communication between user and computer. The purpose of the monitor is to immediately visualize the results of programs running on the computer.");
        productCategoryDataStore.add(monitor);
        ProductCategory laptop = new ProductCategory("Laptop", "Hardware", "A laptop, laptop computer, or notebook computer is a small, portable personal computer (PC) with a screen and alphanumeric keyboard.");
        productCategoryDataStore.add(laptop);
        ProductCategory smartphone = new ProductCategory("Smartphone", "Hardware", "Smartphone is a portable device that combines mobile telephone and computing functions into one unit.");
        productCategoryDataStore.add(smartphone);
        ProductCategory smartwatch = new ProductCategory("Smartwatch", "Hardware", "A smartwatch is a wearable computer in the form of a watch. Modern smartwatches provide a local touchscreen interface for daily use, while an associated smartphone app provides for management and telemetry");
        productCategoryDataStore.add(smartwatch);
        ProductCategory tv_set = new ProductCategory("Television set", "Hardware", "A television set or television receiver, more commonly called the television or TV, is a device that combines a tuner, display, and loudspeakers, for the purpose of viewing and hearing television broadcasting through satellites or cables, or using it as a computer monitor.");
        productCategoryDataStore.add(tv_set);


        //setting up products and printing it
        productDataStore.add(new Product("Amazon Fire", new BigDecimal("49.9"), "USD", "Fantastic price. Large content ecosystem. Good parental controls. Helpful technical support.", tablet, amazon));
        productDataStore.add(new Product("Lenovo IdeaPad Miix 700", new BigDecimal("479"), "USD", "Keyboard cover is included. Fanless Core m5 processor. Full-size USB ports. Adjustable kickstand.", tablet, lenovo));
        productDataStore.add(new Product("Amazon Fire HD 8", new BigDecimal("89"), "USD", "Amazon's latest Fire HD 8 tablet is a great value for media consumption.", tablet, amazon));
        productDataStore.add(new Product("Samsung CF390 27", new BigDecimal("120.9"), "USD", "Ultra curved screen for wide viewing area and image depth. Eye comfort - thanks to flicker free technology and eye saver mode.", monitor, samsung));
        productDataStore.add(new Product("Apple MacBook Pro 13 M1", new BigDecimal("1561.54"), "USD", "It was created for people with high expectations who do not tolerate defects and care about quality and elegance. If that's what you need, this device is the perfect product for you.", laptop, apple));
        productDataStore.add(new Product("Dell Latitude 5510", new BigDecimal("1216.18"), "USD", "Laptop Dell Latitude 5510 i5-10210U | 15,6\" FHD | 8GB | 256GB SSD | Int | Windows 10 Pro (S001L551015PL)", laptop, dell));
        productDataStore.add(new Product("Lenovo ThinkBook 15 G2", new BigDecimal("983.59"), "USD", "The 2nd Generation (AMD) ThinkBook 15, featuring AMD Ryzen 4000 series mobile processors and built-in Radeon graphics, allows you to easily work with demanding applications.", laptop, lenovo));
        productDataStore.add(new Product("Samsung Galaxy A20e", new BigDecimal("261.85"), "USD", "The Samsung Galaxy A20e is equipped with an Exynos 7885 octa-core processor, supported by a 3 GB RAM memory. These parameters will allow the device to operate very quickly, even in the case of demanding games and applications. The internal memory of the smartphone is 32 GB, but it is possible to install an additional microSD card. The battery has a capacity of 3000 mAh and will allow you to work with the device for a long time.", smartphone, samsung));
        productDataStore.add(new Product("Samsung Galaxy S10 Plus", new BigDecimal("887.22"), "USD", "Galaxy S10 + phone, USB cable, in-ear headphones by AKG, SIM card stylus, USB power adapter, USB type C adapter, micro USB adapter, user manual.", smartphone, samsung));
        productDataStore.add(new Product("Apple iPhone 12 Mini", new BigDecimal("789.34"), "USD", "A smartphone not only for minimalists. The new iPhone 12 mini version fits perfectly in the hand, fits in a pocket and purse, and at the same time does not lose its parameters. It is equipped with an equally efficient processor and a high-class display as the standard model, yet it is a device extremely comfortable to use, light and slim.", smartphone, apple));
        productDataStore.add(new Product("Apple iPhone 12 Pro Max", new BigDecimal("1311.54"), "USD", "The most advanced iPhone on the market. Explore the amazing possibilities of the iPhone 12 Pro Max. See even more on the 6.7 '' OLED Super Retina XDR screen. Be enchanted by the possibilities offered by the triple set of lenses in the main camera - record HDR video with Dolby Vision, shoot after dark without losing details and sharpness, and use the potential of 5G network support.", smartphone, apple));
        productDataStore.add(new Product("Huawei P20 Lite", new BigDecimal("317.59"), "USD", "Lose yourself in the next-generation HUAWEI FullView screen, which is designed without compromise. The HUAWEI P20 Lite has an elegant compact frame, which is almost entirely dedicated to the 5.84-inch Full HD screen.", smartphone, huawei));
        productDataStore.add(new Product("Huawei P30", new BigDecimal("317.35"), "USD", "The HUAWEI P30 sets the limit of smartphone photography. With him, you can find your artistic power and see the world from a new perspective. Taking it on vacation, we will discover delightful shots and turn them into precious memories. In this model, the color sensing technique has been changed from RGB to FISH to provide more light in the photos. The fixed images will now not only be full of details or wide plans, but most of all they will captivate with their fantastic colors reflecting the surrounding space.", smartphone, xiaomi));
        productDataStore.add(new Product("Xiaomi Mi Band 6", new BigDecimal("47.43"), "USD", "Stay one step ahead! AMOLED full-screen touchscreen, 30 exercise modes, SpO2 tracking, Sleep tracking, 14 days battery life, Music control", smartwatch, xiaomi));
        productDataStore.add(new Product("Xiaomi Imilab KW66", new BigDecimal("30.02"), "USD", "Stylish Xiaomi IMILAB KW66 sports watch with a clear display and monitoring of the user's physical activity.", smartwatch, xiaomi));
        productDataStore.add(new Product("Huawei Band 6", new BigDecimal("54.24"), "USD", "24/7 SpO2 monitoring, 1.47 \"screen, FullView AMOLED. Up to 2 weeks on a single charge.", smartwatch, huawei));
        productDataStore.add(new Product("SAMSUNG Galaxy Watch 4", new BigDecimal("243.94"), "USD", "In cooperation with Google, we have created the new Wear OS Powered by Samsung operating system. As a result, you gain access to the most popular applications2 (also those offered by third companies) and you can enjoy their incredibly simple operation from the smartwatch.", smartwatch, samsung));
        productDataStore.add(new Product("Apple Watch Series 6", new BigDecimal("882.68"), "USD", "A revolutionary new sensor with an app will measure your blood oxygenation. Anywhere and at any time you can take an EKG. And on the refined non-fading Retina display, you can read your training data in no time. Apple Watch Series 6 will help you live healthier, more active and connected with the world.", smartwatch, apple));
        productDataStore.add(new Product("Samsung UE43AU7192 LED 43'' 4K Ultra HD Tizen", new BigDecimal("453.83"), "USD", "A TV with an LED matrix will certainly meet the expectations of demanding customers. The unquestionable advantage of this backlight technology is the excellent color reproduction. In addition, we are dealing with a very energy-saving solution. It is an ideal proposition for all people who care about above-average image quality and low operating costs. Choose a proven model that will be widely used in your home.", tv_set, samsung));
//        productDataStore.add(new Product("S", new BigDecimal("4"), "USD", "", smartphone, huawei));
    }
}