package com.example.doanapp.model;

import android.app.Application;

import com.example.doanapp.R;

import java.util.ArrayList;

public class App extends Application {
    public static ArrayList<Products> data;
    public static ArrayList<Brand> dataBrand;
    public static ArrayList<Products> dataSneaker;
    public static ArrayList<Products> dataTheThao;
    public static ArrayList<Products> dataBongDa;
    public static ArrayList<Products> dataRunning;
    public static ArrayList<Products> dataNike;
    public static ArrayList<Products> dataAdidas;
    public static ArrayList<Products> dataMlb;
    public static ArrayList<Products> dataPuma;

    @Override
    public void onCreate() {
        super.onCreate();
        if(data == null){
            data = new ArrayList<>();
        }
        if(dataBrand == null){
            dataBrand = new ArrayList<>();
        }
        if(dataTheThao == null){
            dataTheThao = new ArrayList<>();
        }
        if(dataSneaker == null){
            dataSneaker = new ArrayList<>();
        }
        if(dataRunning == null){
            dataRunning = new ArrayList<>();
        }
        if(dataBongDa == null){
            dataBongDa = new ArrayList<>();
        }
        if(dataNike == null){
            dataNike = new ArrayList<>();
        }
        if(dataAdidas == null){
            dataAdidas = new ArrayList<>();
        }
        if(dataMlb == null){
            dataMlb = new ArrayList<>();
        }
        if(dataPuma == null){
            dataPuma = new ArrayList<>();
        }
    }

    public static ArrayList<Products> initdataForProducts(){
        //sneaker

        data.add(new Products(1,
                R.drawable.nike_air1,
                "Air Force 1",
                4000000,
                "Giày Nike Air Force 1 ’07 White CW2288 111 có thiết kế đẹp mắt, kiểu dáng hiện đại. Với đôi giày thời trang này chắc chắn bạn sẽ trở nên nổi bật và cuốn hút hơn.Phần trên của giày Nike Air Force 1 ’07 White CW2288 111 màu trắng được làm từ chất liệu da cao cấp với độ ôm được thiết kế đặc biệt để nâng đỡ có định hướng và hỗ trợ chuyển động."));


        data.add(new Products(2,
                R.drawable.nike_air_jordan1,
                "Nike Air Jordan1",
                5200000, "Giày Thể Thao Nike Air Jordan 1 Low (GS) 'Vintage Grey' 553560-053 Màu Xám Trắng với thiết kế mang đậm tinh thần thể thao đến từ thương hiệu Nike nổi tiếng. Sở hữu phối màu thời thượng, chất liệu da cao cấp bền bỉ, mẫu giày Nike Air Jordan 1 Low (GS) 'Vintage Grey' 553560-053 đang là item được các tín đồ mê sneaker săn đón. Giày thể thao Nike Air Jordan 1 Low (GS) 'Vintage Grey' 553560-053 được Nike sử dụng chất liệu da cao cấp, chống nước tốt và bền đẹp trong thời gian dài sử dụng. Từng chi tiết trên đôi giày đều được trau chuốt tỉ mỉ, sắc xảo. Lấy màu xám làm tone màu chủ đạo, mẫu giày mang đến vẻ ngoài cá tính, mạnh mẽ và năng động."));


        data.add(new Products(3,
                R.drawable.puma_oslo_city_lux1,
                "Puma Oslo-city Lux",
                1990000,
                "Giày thể thao Puma Oslo-City Lux được làm từ chất liệu da cao cấp với độ ôm được thiết kế đặc biệt hỗ trợ chuyển động. Form giày Puma với các đường chỉ khâu vô cùng tỉ mỉ và chắc chắn. Nắm được xu thế chung của những khách hàng yêu thích phong cách thời trang hiện đại, đặc biệt là những thiết kế độc - lạ, giày thể thao Puma Oslo-City Lux ra đời đáp ứng được nhu cầu của những tín đồ thời trang trên toàn thế giới."));

        data.add(new Products(4,
                R.drawable.puma_clyde_stitch1,
                "Puma Clyde Stitch",
                1990000,
                "Giày thể thao Puma Clyde Stitch được làm từ chất liệu da trơn cao cấp, bền đẹp trong suốt quá trình sử dụng. Lót giày Puma êm ái giúp bạn luôn cảm thấy thoải mái cho dù có đi giày cả ngày dài. Form giày Puma đi lên chân vừa vặn, các đường chỉ khâu vô cùng chắc chắn và tỉ mỉ hài lòng mọi khách hàng. Đôi giày với kiểu dáng Style trẻ trung, đẹp mắt, mang đậm phong cách, cá tính."));


        data.add(new Products(5,
                R.drawable.adidas_stan_smith1,
                "Adidas Stan Smith",
                1750000,
                "Giày Adidas Originals Stan Smith Men's Shoes M20324 không phải là cái tên quá mới lạ trong trong danh sách giày thể thao sneaker nam đẹp. Giá giày Adidas Stan Smith M20324 luôn có mức giá phải chăng dễ mua nên việc các tín đồ giày sneaker và người yêu chạy bộ săn tìm cũng dễ dàng hơn. Đế giày Adidas Stan Smith M20324 giúp bạn thoải mái chạy trên máy chạy bộ hoặc ngoài trời, và đương nhiên, thiết kế cũng như chất liệu Primeknit cao cấp của phần upper cho phép bạn kết hợp với hầu hết các trang phục như một đôi sneaker đẹp."));

        data.add(new Products(6,
                R.drawable.adidas_supperstar1,
                "Adidas Supperstar",
                1800000,
                "Giày Adidas Superstar Originals AQ1214 trắng là giày cổ thấp với thiết kế mõm sò độc quyền của Adidas, phù hợp cho cả nam nữ, già trẻ, dễ dàng phối đồ và đang được nhiều tín đồ thời trang ưa chuộng. Giày Adidas Superstar Originals là một đôi giày nên có trong tủ đồ của bản bởi tính đa dụng và tiện lợi của nó."));


        data.add(new Products(7,
                R.drawable.mlb_korea_low_top1,
                "MLB Korea Low-Top",
                1800000,
                "Giày thể thao MLB Korea Low-Top Sneakers được làm từ chất liệu vải dệt cao cấp với độ ôm hỗ trợ chuyển động. Đôi giày với thiết kế đơn giản đẹp mắt với tông màu trắng sang trọng. Họa tiết viền đỏ độc đáo, phá cách tạo điểm nhấn cho bạn phong cách trẻ trung, năng động."));


        data.add(new Products(8,
                R.drawable.mlb_chunky_classic1,
                "MLB Chunky Classic A New York YanKees",
                1800000,
                "Giày MLB Chunky Classic A New York Yankees 3ASXXA12N-50IVS thuộc một trong những dòng giày bán chạy nhất của thương hiệu Hàn Quốc MLB. Với gam màu trang nhã, thiết kế tôn dáng, mẫu giày MLB Chunky Classic A New York Yankees 3ASXXA12N-50IVS sẽ là điểm nhấn thú vị cho bộ trang phục của bạn."));

        //Thể Thao


        data.add(new Products(9,
                R.drawable.nike_airmax1,
                "Nike Airmax 270 React Youth",
                2790000,
                "Giày thể thao Nike Airmax 270 React Youth CT9633-100 với kiểu dáng trẻ trung, hiện đại đến từ thương hiệu Nike nổi tiếng của Mỹ. Đôi giày Nike Airmax 270 sẽ cho bạn trải nghiệm tuyệt vời nhất khi đi lên chân."));

        data.add(new Products(10,
                R.drawable.nike_airmax_light1,
                "Nike Airmax 2 Light Habanero red",
                2790000, "Giày thể thao Nike Air Max 2 Light Habanero Red được làm từ chất liệu da và vải cao cấp với độ ôm được thiết kế đặc biệt để nâng đỡ có định hướng và hỗ trợ chuyển động."));


        data.add(new Products(11,
                R.drawable.adidas_boost_cloud1,
                "Adidas ZX 2K Boost  Cloud",
                2400000, "Giày thể thao Adidas ZX 2K Boost Cloud White Solar Red Blue màu trắng là đôi giày dành cho nam đến từ thương hiệu Adidas nổi tiếng. Sở hữu gam màu nổi bật cùng chất liệu cao cấp Adidas ZX 2K Boost Cloud White Solar Red Blue sẽ cho bạn trải nghiệm tuyệt vời khi đi lên chân."));


        data.add(new Products(12,
                R.drawable.adidas_f_w1,
                "Adidas FW8077",
                2280000, "Giày Thể Thao Adidas FW8077 Màu Trắng Size 41 là đôi giày dành cho nam đến từ thương hiệu Adidas nổi tiếng. Sở hữu gam màu nổi bật cùng chất liệu cao cấp Giày thể thao Adidas FW8077 sẽ cho bạn trải nghiệm tuyệt vời khi đi lên chân."));



        data.add(new Products(13,
                R.drawable.puma_thunder1,
                "Puma Thunder Spectra Triple",
                2770000, "Giày thể thao Puma Thunder Spectra Triple White 370682-01 size 38 mang gam màu trắng thanh lịch đến từ thương hiệu Puma nổi tiếng. Giày Puma Thunder Spectra Triple thích hợp cho nhiều hoạt động như chạy bộ, tập gym, chơi thể thao."));

        data.add(new Products(14,
                R.drawable.puma_r_s_x1,
                "Puma RS-X Core",
                2690000, "Giày Puma RS-X Core Black với thiết kế form thể thao phóng đại, đi chắc chắn, êm ái, và vô cùng tiện lợi. Nắm được xu hướng chung, đánh vào tập khách hàng mê mẩn những item thời trang hiện đại, giày Puma RS-X Core Black ra đời đã đáp ứng được những mong mỏi của người yêu thời trang trên toàn thế giới."));


        data.add(new Products(15,
                R.drawable.mlb_big_ball1,
                "MLB Big Ball Chunky New York",
                2890000, "Giày MLB Big Ball Chunky New York Yankees 32SHCD111-50I là đôi giày thời trang dành cho cả nam và nữ đến từ thương hiệu MLB Hàn Quốc. Với gam màu thanh lịch cùng thiết kế hiện đại, đôi giày MLB Big Ball Chunky New York Yankees sẽ cho bạn trải nghiệm tuyệt vời khi đi lên chân."));

        data.add(new Products(16,
                R.drawable.mlb_big_ball_a_line1,
                "MLB Big Ball Chunky A Line New York",
                2890000, "Giày MLB Big Ball Chunky A Line New York Yankees 3ASHCLS2N-50BKS thuộc dòng giày unisex nổi tiếng của thương hiệu MLB Hàn Quốc. Với thiết kế tôn dáng, phối màu đẹp mắt, mầu giày MLB Big Ball Chunky A Line New York Yankees 3ASHCLS2N-50BKS được giới trẻ săn đón ngay từ khi mới mở bán."));

        //Giày chạy


        data.add(new Products(17,
                R.drawable.nike_odyssey1,
                "Nike Odyssey React Women's Running Shoes",
                1700000,
                "Nike Odyssey React Women's Running Shoes AO9820602 Size 36.5 là sản phẩm giày chạy dành cho nữ sử dụng công nghệ đệm React mới nhất của Nike, giày có trọng lượng nhẹ, tạo cảm giác êm ái khi vận động sẽ giúp bạn cảm thấy thoải mái. Nike Odyssey React Women's Running Shoes AO9820602 còn có khả năng hỗ trợ chuyển hướng linh hoạt và giảm nguy cơ chấn thương khi chạy."));

        data.add(new Products(18,
                R.drawable.nike_zoom1,
                "Nike Zoom Winflo 6 Women's Shoes",
                2200000,
                "Giày Nike Air Zoom Winflo 6 Women's Shoes Grey White AQ8228-002 size 38.5 là sản phẩm giày chạy dành cho nữ giới với màu xám chủ đạo, thiết kế tối giản, hiện đại với công nghệ đệm Zoom và các lỗ thoáng khí ở phần upper giúp mang lại cảm giác êm ái, nhẹ nhàng và thoải mái khi vận động."));


        data.add(new Products(19,
                R.drawable.adidas_lite1,
                "Adidas Lite Racer 2.0",
                1400000,
                "Giày Chạy Bộ Nam Adidas Lite Racer 2.0 - FZ0392 là đôi giày dành cho nam đến từ thương hiệu Adidas nổi tiếng. Sở hữu gam màu thanh lịch cùng chất liệu cao cấp Giày Chạy Bộ Nam Adidas Lite Racer 2.0 - FZ0392 sẽ cho bạn trải nghiệm tuyệt vời cho bạn."));

        data.add(new Products(20,
                R.drawable.adidas_ultraboost1,
                "Adidas Ultraboost 21",
                4000000,
                "Giày Chạy Bộ Nữ Adidas Ultraboost 21 W S23845 Phối Màu với phối màu lạ mắt đến từ thương hiệu Adidas nổi tiếng. Mẫu giày Adidas Ultraboost 21 W cùng chất liệu cao cấp, sẽ mang đến cho bạn trải nghiệm êm ái nhất khi lên chân."));


        data.add(new Products(21,
                R.drawable.puma_scuderia1,
                "Puma Scuderia Ferrari Speed Hybrid Running",
                1980000,
                "Giày Puma Scuderia Ferrari Speed HYBRID Running 339847_01-380 Size 38 được thiết kế đặc biệt đáp ứng tốt sự êm ái, độ đàn hồi và phong cách thời trang độc đáo."));

        data.add(new Products(22,
                R.drawable.puma_turin1,
                "Puma Shoes Puma Turin II",
                1880000,
                "Giày Thể Thao Puma Shoes Puma Turin II Jr 366773 02 Màu Trắng với thiết kế hiện đại đến từ thương hiệu nổi tiếng Puma. Sở hữu phối màu trắng basic dễ phối đồ, mẫu giày Puma Shoes Puma Turin II Jr 366773 02 sẽ là item mà các tín đồ mê sneaker đều nên sở hữu trong bộ sưu tập của mình."));


        //Giày đá bóng


        data.add(new Products(23,
                R.drawable.nike_phantom1,
                "Nike Phantom VSN Academy TF",
                1880000,
                "Giày bóng đá Nike Phantom Vsn Academy Df Tf Ao3269-080 với kiểu dáng trẻ trung, hiện đại đến từ thương hiệu Nike nổi tiếng của Mỹ. Đôi giày Nike Phantom Vsn Academy Df Tf Ao3269-080 sẽ cho bạn trải nghiệm tuyệt vời nhất khi đi lên chân. Ngay từ khi có mặt trên thị trường, đôi giày luôn được các chàng trai yêu thích bóng đá săn đón."));

        data.add(new Products(24,
                R.drawable.nike_vapor1,
                "Nike Vapor 15 Academy TF",
                2100000,
                "Với phân khúc Academy, với hai mẫu Mercurial Superfly 9 và Vapor 15 Academy. Đây là phân khúc có giá thành khá hợp lý và phù hợp với điều kiện kinh tế của nhiều người chơi bóng bán chuyên và phong trào tại Việt Nam. Ở phiên bản Vapor 14 và Superfly 8 trước đó, phiên bản Academy của dòng Mercurial đã tạo nên cơn sốt rất lớn tại thị trường Việt Nam, với chất liệu mềm mại, cảm giác nhẹ nhàng và sự thật chân khi mang."));



        data.add(new Products(25,
                R.drawable.adidas_speedflow_turf1,
                "Adidas X Speedflow.1 Turf Shoes",
                3220000,
                "Giày đá bóng Adidas X Speedflow.1 Turf Shoes GW7473 có thiết kế trẻ trung, năng động đến từ thương hiệu Adidas nổi tiếng của Đức. Giày được làm từ chất liệu cao cấp, bền đẹp nâng niu đôi chân trong suốt quá trình sử dụng."));

        data.add(new Products(26,
                R.drawable.adidas_nemeziz1,
                "Adidas Nemeziz.3 Turf",
                1590000,
                "Giày bóng đá Adidas Nemeziz .3 Turf với kiểu dáng trẻ trung, hiện đại đến từ thương hiệu Adidas nổi tiếng của Đức. Đôi giày Adidas Nemeziz .3 Turf sẽ cho bạn trải nghiệm tuyệt vời nhất khi đi lên chân."));


        data.add(new Products(27,
                R.drawable.puma_rapido1,
                "Puma Rapido II",
                1450000,
                "Giày bóng đá Puma Rapido II TT (106062-01) với phần thân giày được làm từ chất liệu da tổng hợp cao cấp. Form giày ôm chân hoàn hảo với các đường nét vô cùng tỉ mỉ và chắc chắn. Thiết kế siêu nhẹ và ôm chân cho bạn tư thế vững chãi. Đế ngoài bằng cao su thuôn gọn tăng cường đàn hồi trên mặt sân cỏ nhân tạo."));

        data.add(new Products(28,
                R.drawable.puma_rapido_ii1,
                "Puma Rapido II TF106062",
                1650000,
                "Giày bóng đá Puma Rapido Ii Tf 106062 02 với phần thân giày được làm từ chất liệu da tổng hợp cao cấp. Form giày ôm chân hoàn hảo với các đường nét vô cùng tỉ mỉ và chắc chắn. Thiết kế siêu nhẹ và ôm chân cho bạn tư thế vững chãi."));



        return data;
    }

    public  static ArrayList<Products> initdataForSneaker(){

        dataSneaker.add(new Products(1,
                R.drawable.nike_air1,
                "Air Force 1",
                4000000,
                "Giày Nike Air Force 1 ’07 White CW2288 111 có thiết kế đẹp mắt, kiểu dáng hiện đại. Với đôi giày thời trang này chắc chắn bạn sẽ trở nên nổi bật và cuốn hút hơn.Phần trên của giày Nike Air Force 1 ’07 White CW2288 111 màu trắng được làm từ chất liệu da cao cấp với độ ôm được thiết kế đặc biệt để nâng đỡ có định hướng và hỗ trợ chuyển động."));


        dataSneaker.add(new Products(2,
                R.drawable.nike_air_jordan1,
                "Nike Air Jordan1",
                5200000, "Giày Thể Thao Nike Air Jordan 1 Low (GS) 'Vintage Grey' 553560-053 Màu Xám Trắng với thiết kế mang đậm tinh thần thể thao đến từ thương hiệu Nike nổi tiếng. Sở hữu phối màu thời thượng, chất liệu da cao cấp bền bỉ, mẫu giày Nike Air Jordan 1 Low (GS) 'Vintage Grey' 553560-053 đang là item được các tín đồ mê sneaker săn đón. Giày thể thao Nike Air Jordan 1 Low (GS) 'Vintage Grey' 553560-053 được Nike sử dụng chất liệu da cao cấp, chống nước tốt và bền đẹp trong thời gian dài sử dụng. Từng chi tiết trên đôi giày đều được trau chuốt tỉ mỉ, sắc xảo. Lấy màu xám làm tone màu chủ đạo, mẫu giày mang đến vẻ ngoài cá tính, mạnh mẽ và năng động."));


        dataSneaker.add(new Products(3,
                R.drawable.puma_oslo_city_lux1,
                "Puma Oslo-city Lux",
                1990000,
                "Giày thể thao Puma Oslo-City Lux được làm từ chất liệu da cao cấp với độ ôm được thiết kế đặc biệt hỗ trợ chuyển động. Form giày Puma với các đường chỉ khâu vô cùng tỉ mỉ và chắc chắn. Nắm được xu thế chung của những khách hàng yêu thích phong cách thời trang hiện đại, đặc biệt là những thiết kế độc - lạ, giày thể thao Puma Oslo-City Lux ra đời đáp ứng được nhu cầu của những tín đồ thời trang trên toàn thế giới."));

        dataSneaker.add(new Products(4,
                R.drawable.puma_clyde_stitch1,
                "Puma Clyde Stitch",
                1990000,
                "Giày thể thao Puma Clyde Stitch được làm từ chất liệu da trơn cao cấp, bền đẹp trong suốt quá trình sử dụng. Lót giày Puma êm ái giúp bạn luôn cảm thấy thoải mái cho dù có đi giày cả ngày dài. Form giày Puma đi lên chân vừa vặn, các đường chỉ khâu vô cùng chắc chắn và tỉ mỉ hài lòng mọi khách hàng. Đôi giày với kiểu dáng Style trẻ trung, đẹp mắt, mang đậm phong cách, cá tính."));


        dataSneaker.add(new Products(5,
                R.drawable.adidas_stan_smith1,
                "Adidas Stan Smith",
                1750000,
                "Giày Adidas Originals Stan Smith Men's Shoes M20324 không phải là cái tên quá mới lạ trong trong danh sách giày thể thao sneaker nam đẹp. Giá giày Adidas Stan Smith M20324 luôn có mức giá phải chăng dễ mua nên việc các tín đồ giày sneaker và người yêu chạy bộ săn tìm cũng dễ dàng hơn. Đế giày Adidas Stan Smith M20324 giúp bạn thoải mái chạy trên máy chạy bộ hoặc ngoài trời, và đương nhiên, thiết kế cũng như chất liệu Primeknit cao cấp của phần upper cho phép bạn kết hợp với hầu hết các trang phục như một đôi sneaker đẹp."));

        dataSneaker.add(new Products(6,
                R.drawable.adidas_supperstar1,
                "Adidas Supperstar",
                1800000,
                "Giày Adidas Superstar Originals AQ1214 trắng là giày cổ thấp với thiết kế mõm sò độc quyền của Adidas, phù hợp cho cả nam nữ, già trẻ, dễ dàng phối đồ và đang được nhiều tín đồ thời trang ưa chuộng. Giày Adidas Superstar Originals là một đôi giày nên có trong tủ đồ của bản bởi tính đa dụng và tiện lợi của nó."));


        dataSneaker.add(new Products(7,
                R.drawable.mlb_korea_low_top1,
                "MLB Korea Low-Top",
                1800000,
                "Giày thể thao MLB Korea Low-Top Sneakers được làm từ chất liệu vải dệt cao cấp với độ ôm hỗ trợ chuyển động. Đôi giày với thiết kế đơn giản đẹp mắt với tông màu trắng sang trọng. Họa tiết viền đỏ độc đáo, phá cách tạo điểm nhấn cho bạn phong cách trẻ trung, năng động."));


        dataSneaker.add(new Products(8,
                R.drawable.mlb_chunky_classic1,
                "MLB Chunky Classic A New York YanKees",
                1800000,
                "Giày MLB Chunky Classic A New York Yankees 3ASXXA12N-50IVS thuộc một trong những dòng giày bán chạy nhất của thương hiệu Hàn Quốc MLB. Với gam màu trang nhã, thiết kế tôn dáng, mẫu giày MLB Chunky Classic A New York Yankees 3ASXXA12N-50IVS sẽ là điểm nhấn thú vị cho bộ trang phục của bạn."));


        return dataSneaker;
    }

    public  static ArrayList<Products> initdataForTheThao(){
        dataTheThao.add(new Products(9,
                R.drawable.nike_airmax1,
                "Nike Airmax 270 React Youth",
                2790000,
                "Giày thể thao Nike Airmax 270 React Youth CT9633-100 với kiểu dáng trẻ trung, hiện đại đến từ thương hiệu Nike nổi tiếng của Mỹ. Đôi giày Nike Airmax 270 sẽ cho bạn trải nghiệm tuyệt vời nhất khi đi lên chân."));

        dataTheThao.add(new Products(10,
                R.drawable.nike_airmax_light1,
                "Nike Airmax 2 Light Habanero red",
                2790000, "Giày thể thao Nike Air Max 2 Light Habanero Red được làm từ chất liệu da và vải cao cấp với độ ôm được thiết kế đặc biệt để nâng đỡ có định hướng và hỗ trợ chuyển động."));


        dataTheThao.add(new Products(11,
                R.drawable.adidas_boost_cloud1,
                "Adidas ZX 2K Boost  Cloud",
                2400000, "Giày thể thao Adidas ZX 2K Boost Cloud White Solar Red Blue màu trắng là đôi giày dành cho nam đến từ thương hiệu Adidas nổi tiếng. Sở hữu gam màu nổi bật cùng chất liệu cao cấp Adidas ZX 2K Boost Cloud White Solar Red Blue sẽ cho bạn trải nghiệm tuyệt vời khi đi lên chân."));


        dataTheThao.add(new Products(12,
                R.drawable.adidas_f_w1,
                "Adidas FW8077",
                2280000, "Giày Thể Thao Adidas FW8077 Màu Trắng Size 41 là đôi giày dành cho nam đến từ thương hiệu Adidas nổi tiếng. Sở hữu gam màu nổi bật cùng chất liệu cao cấp Giày thể thao Adidas FW8077 sẽ cho bạn trải nghiệm tuyệt vời khi đi lên chân."));



        dataTheThao.add(new Products(13,
                R.drawable.puma_thunder1,
                "Puma Thunder Spectra Triple",
                2770000, "Giày thể thao Puma Thunder Spectra Triple White 370682-01 size 38 mang gam màu trắng thanh lịch đến từ thương hiệu Puma nổi tiếng. Giày Puma Thunder Spectra Triple thích hợp cho nhiều hoạt động như chạy bộ, tập gym, chơi thể thao."));

        dataTheThao.add(new Products(14,
                R.drawable.puma_r_s_x1,
                "Puma RS-X Core",
                2690000, "Giày Puma RS-X Core Black với thiết kế form thể thao phóng đại, đi chắc chắn, êm ái, và vô cùng tiện lợi. Nắm được xu hướng chung, đánh vào tập khách hàng mê mẩn những item thời trang hiện đại, giày Puma RS-X Core Black ra đời đã đáp ứng được những mong mỏi của người yêu thời trang trên toàn thế giới."));


        dataTheThao.add(new Products(15,
                R.drawable.mlb_big_ball1,
                "MLB Big Ball Chunky New York",
                2890000, "Giày MLB Big Ball Chunky New York Yankees 32SHCD111-50I là đôi giày thời trang dành cho cả nam và nữ đến từ thương hiệu MLB Hàn Quốc. Với gam màu thanh lịch cùng thiết kế hiện đại, đôi giày MLB Big Ball Chunky New York Yankees sẽ cho bạn trải nghiệm tuyệt vời khi đi lên chân."));

        dataTheThao.add(new Products(16,
                R.drawable.mlb_big_ball_a_line1,
                "MLB Big Ball Chunky A Line New York",
                2890000, "Giày MLB Big Ball Chunky A Line New York Yankees 3ASHCLS2N-50BKS thuộc dòng giày unisex nổi tiếng của thương hiệu MLB Hàn Quốc. Với thiết kế tôn dáng, phối màu đẹp mắt, mầu giày MLB Big Ball Chunky A Line New York Yankees 3ASHCLS2N-50BKS được giới trẻ săn đón ngay từ khi mới mở bán."));

        return dataTheThao;
    }

    public  static ArrayList<Products> initdataForRunning(){

        dataRunning.add(new Products(17,
                R.drawable.nike_odyssey1,
                "Nike Odyssey React Women's Running Shoes",
                1700000,
                "Nike Odyssey React Women's Running Shoes AO9820602 Size 36.5 là sản phẩm giày chạy dành cho nữ sử dụng công nghệ đệm React mới nhất của Nike, giày có trọng lượng nhẹ, tạo cảm giác êm ái khi vận động sẽ giúp bạn cảm thấy thoải mái. Nike Odyssey React Women's Running Shoes AO9820602 còn có khả năng hỗ trợ chuyển hướng linh hoạt và giảm nguy cơ chấn thương khi chạy."));

        dataRunning.add(new Products(18,
                R.drawable.nike_zoom1,
                "Nike Zoom Winflo 6 Women's Shoes",
                2200000,
                "Giày Nike Air Zoom Winflo 6 Women's Shoes Grey White AQ8228-002 size 38.5 là sản phẩm giày chạy dành cho nữ giới với màu xám chủ đạo, thiết kế tối giản, hiện đại với công nghệ đệm Zoom và các lỗ thoáng khí ở phần upper giúp mang lại cảm giác êm ái, nhẹ nhàng và thoải mái khi vận động."));


        dataRunning.add(new Products(19,
                R.drawable.adidas_lite1,
                "Adidas Lite Racer 2.0",
                1400000,
                "Giày Chạy Bộ Nam Adidas Lite Racer 2.0 - FZ0392 là đôi giày dành cho nam đến từ thương hiệu Adidas nổi tiếng. Sở hữu gam màu thanh lịch cùng chất liệu cao cấp Giày Chạy Bộ Nam Adidas Lite Racer 2.0 - FZ0392 sẽ cho bạn trải nghiệm tuyệt vời cho bạn."));

        dataRunning.add(new Products(20,
                R.drawable.adidas_ultraboost1,
                "Adidas Ultraboost 21",
                4000000,
                "Giày Chạy Bộ Nữ Adidas Ultraboost 21 W S23845 Phối Màu với phối màu lạ mắt đến từ thương hiệu Adidas nổi tiếng. Mẫu giày Adidas Ultraboost 21 W cùng chất liệu cao cấp, sẽ mang đến cho bạn trải nghiệm êm ái nhất khi lên chân."));


        dataRunning.add(new Products(21,
                R.drawable.puma_scuderia1,
                "Puma Scuderia Ferrari Speed Hybrid Running",
                1980000,
                "Giày Puma Scuderia Ferrari Speed HYBRID Running 339847_01-380 Size 38 được thiết kế đặc biệt đáp ứng tốt sự êm ái, độ đàn hồi và phong cách thời trang độc đáo."));

        dataRunning.add(new Products(22,
                R.drawable.puma_turin1,
                "Puma Shoes Puma Turin II",
                1880000,
                "Giày Thể Thao Puma Shoes Puma Turin II Jr 366773 02 Màu Trắng với thiết kế hiện đại đến từ thương hiệu nổi tiếng Puma. Sở hữu phối màu trắng basic dễ phối đồ, mẫu giày Puma Shoes Puma Turin II Jr 366773 02 sẽ là item mà các tín đồ mê sneaker đều nên sở hữu trong bộ sưu tập của mình."));


        return dataRunning;
    }

    public  static ArrayList<Products> initdataForBongDa(){

        dataBongDa.add(new Products(23,
                R.drawable.nike_phantom1,
                "Nike Phantom VSN Academy TF",
                1880000,
                "Giày bóng đá Nike Phantom Vsn Academy Df Tf Ao3269-080 với kiểu dáng trẻ trung, hiện đại đến từ thương hiệu Nike nổi tiếng của Mỹ. Đôi giày Nike Phantom Vsn Academy Df Tf Ao3269-080 sẽ cho bạn trải nghiệm tuyệt vời nhất khi đi lên chân. Ngay từ khi có mặt trên thị trường, đôi giày luôn được các chàng trai yêu thích bóng đá săn đón."));

        dataBongDa.add(new Products(24,
                R.drawable.nike_vapor1,
                "Nike Vapor 15 Academy TF",
                2100000,
                "Với phân khúc Academy, với hai mẫu Mercurial Superfly 9 và Vapor 15 Academy. Đây là phân khúc có giá thành khá hợp lý và phù hợp với điều kiện kinh tế của nhiều người chơi bóng bán chuyên và phong trào tại Việt Nam. Ở phiên bản Vapor 14 và Superfly 8 trước đó, phiên bản Academy của dòng Mercurial đã tạo nên cơn sốt rất lớn tại thị trường Việt Nam, với chất liệu mềm mại, cảm giác nhẹ nhàng và sự thật chân khi mang."));



        dataBongDa.add(new Products(25,
                R.drawable.adidas_speedflow_turf1,
                "Adidas X Speedflow.1 Turf Shoes",
                3220000,
                "Giày đá bóng Adidas X Speedflow.1 Turf Shoes GW7473 có thiết kế trẻ trung, năng động đến từ thương hiệu Adidas nổi tiếng của Đức. Giày được làm từ chất liệu cao cấp, bền đẹp nâng niu đôi chân trong suốt quá trình sử dụng."));

        dataBongDa.add(new Products(26,
                R.drawable.adidas_nemeziz1,
                "Adidas Nemeziz.3 Turf",
                1590000,
                "Giày bóng đá Adidas Nemeziz .3 Turf với kiểu dáng trẻ trung, hiện đại đến từ thương hiệu Adidas nổi tiếng của Đức. Đôi giày Adidas Nemeziz .3 Turf sẽ cho bạn trải nghiệm tuyệt vời nhất khi đi lên chân."));


        dataBongDa.add(new Products(27,
                R.drawable.puma_rapido1,
                "Puma Rapido II",
                1450000,
                "Giày bóng đá Puma Rapido II TT (106062-01) với phần thân giày được làm từ chất liệu da tổng hợp cao cấp. Form giày ôm chân hoàn hảo với các đường nét vô cùng tỉ mỉ và chắc chắn. Thiết kế siêu nhẹ và ôm chân cho bạn tư thế vững chãi. Đế ngoài bằng cao su thuôn gọn tăng cường đàn hồi trên mặt sân cỏ nhân tạo."));

        dataBongDa.add(new Products(28,
                R.drawable.puma_rapido_ii1,
                "Puma Rapido II TF106062",
                1650000,
                "Giày bóng đá Puma Rapido Ii Tf 106062 02 với phần thân giày được làm từ chất liệu da tổng hợp cao cấp. Form giày ôm chân hoàn hảo với các đường nét vô cùng tỉ mỉ và chắc chắn. Thiết kế siêu nhẹ và ôm chân cho bạn tư thế vững chãi."));


        return dataBongDa;
    }

    public  static ArrayList<Brand> initdataForBrand(){
        dataBrand.add(new Brand(1, "Nike", R.drawable.nike_logo));
        dataBrand.add(new Brand(2, "Adidas", R.drawable.adidas_logo));
        dataBrand.add(new Brand(3, "Mlb", R.drawable.mlb_logo));
        dataBrand.add(new Brand(4, "Puma", R.drawable.puma_logo));

        return dataBrand;
    }

    public static ArrayList<Products> initdataForNike(){
        dataNike.add(new Products(1,
                R.drawable.nike_air_force1,
                "Nike Air Force 1 Custom ITACHI X JAPAN",
                4150000, ""));
        dataNike.add(new Products(2,
                R.drawable.nike_air_force1_blood,
                "Nike Air Force 1 Blood",
                5400000, ""));
        dataNike.add(new Products(3,
                R.drawable.nike_air_force1_fire_water,
                "Nike Air Force 1 Custom Fire & Water",
                4000000, ""));
        dataNike.add(new Products(4,
                R.drawable.nike_air_force1_ombre_blue_fire,
                "Nike Air Force 1 Ombre Blue Fire",
                3450000, ""));
        dataNike.add(new Products(5,
                R.drawable.nike_air_force1_shadow_spruce_aura,
                "Nike Air Force 1 Shadow Spruce Aura",
                4600000, ""));
        dataNike.add(new Products(6,
                R.drawable.nike_airgold,
                "Nike Air Force 1 Gold",
                4000000, ""));


        return dataNike;
    };
    public static ArrayList<Products> initdataForAdidas(){
        dataAdidas.add(new Products(1,
                R.drawable.adidas_galaxy,
                "Adidas Galaxy 6 Running Blue White",
                1900000, ""));
        dataAdidas.add(new Products(2,
                R.drawable.adidas_galaxy_5_glow_pink,
                "Adidas Galaxy 5 Glow Pink",
                1900000, ""));
        dataAdidas.add(new Products(3,
                R.drawable.adidas_racer,
                "Adidas Men Sport Insprired Lite Racer",
                1700000, ""));
        dataAdidas.add(new Products(4,
                R.drawable.adidas_solar_glide,
                "Adidas Solar Glide 'Screaming Pink' ",
                2590000, ""));
        dataAdidas.add(new Products(5,
                R.drawable.adidas_forum_84_low,
                "Adidas Forum 84 Low",
                3500000, ""));
        return dataAdidas;
    };
    public static ArrayList<Products> initdataForMlb(){
        dataMlb.add(new Products(1,
                R.drawable.mlb_bigball_chunky_ala_dodgers,
                "MLB Bigball Chunky A LA Dodgers",
                2200000, ""));
        dataMlb.add(new Products(2,
                R.drawable.mlb_chunky_high_ny,
                "MLB Chunky High New York Yankees",
                2900000, ""));
        dataMlb.add(new Products(3,
                R.drawable.mlb_chunky_liner,
                "MLB Chunky Liner Mid Denim Boston Red Sox",
                5010000, ""));
        dataMlb.add(new Products(4,
                R.drawable.mlb_classic_new_york_yankees_white,
                "MLB Bigball Chunky A Classic 3DD Logo New York Yankees White",
                4000000, ""));
        dataMlb.add(new Products(5,
                R.drawable.mlb_chunky_liner_mid_denim_ny,
                "MLB Chunky Liner Mid Denim New York Yankees Sox",
                5010000, ""));
        return dataMlb;
    };
    public static ArrayList<Products> initdataForPuma(){
        dataPuma.add(new Products(1,
                R.drawable.puma_jada_bleach,
                "Puma Jada Bleach",
                1900000, ""));
        dataPuma.add(new Products(2,
                R.drawable.puma_jada_hazy_summe,
                "Puma Jada Hazy Summer White-Arctic Ice-Fizzy ",
                2200000, ""));
        dataPuma.add(new Products(3,
                R.drawable.puma_rebound_joylow,
                "Puma Rebound Joylow",
                1900000, ""));
        dataPuma.add(new Products(4,
                R.drawable.puma_roma,
                "Puma Roma 68 Vintage",
                2200000, ""));
        dataPuma.add(new Products(5,
                R.drawable.puma_skye_clean_white_black,
                "Puma Skye Clean White Black",
                2500000, ""));
        return dataPuma;
    };
}
