Hướng dẫn cài đặt android


 - Để cài đặt android thì chúng ta cần cài đặt các gói sau:
   + Cài đặt javaJDK
   + Android SDK
   + ADT plugin cho eclipse


#####Cài đặt javaJDK:


  + Có 2 cách cài đặt: 
     - thứ nhất là dùng lệnh `sudo apt-get install sun-java6-jdk `
     - cài đặt bằng unbuntu software bạn gõ vào từ khóa java


![](https://cloud.githubusercontent.com/assets/4001514/4401690/6f71eab0-4490-11e4-9a5a-d3cb1047edec.png)











##### Cài đặt eclipse có nhiều tools để phát triển dự án android nhưng eclipse là tool hỗ trợ đầy đủ nhất


![](https://cloud.githubusercontent.com/assets/4001514/4401691/6f9d1b7c-4490-11e4-94a1-d1d4f9b27eef.png)





##### Android SDK 
+ Cài đặt ADT plugin cho eclipse
   - Trước khi cài đặt ADT plugin các bạn cần phải cập nhật các thư viện cần thiết để có thể cài đặt và sử dụng ADT trên Eclipse , để thực hiện cập nhật bạn mở eclipse lên vào Help=> Install New SoftWare như sau 


![](https://cloud.githubusercontent.com/assets/4001514/4401687/6f3808e0-4490-11e4-938c-0f447bd7edb9.png)


sau đó chọn add và nhập link “https://dl-ssl.google.com/android/eclipse/” và location:\


![](https://cloud.githubusercontent.com/assets/4001514/4401689/6f712d78-4490-11e4-9b8d-687b8e4c5354.png)


sau đó nhấn nút “OK”


Tiếp theo ra ngoài bạn chọn tích vào Development Tools như hình sau:


![](https://cloud.githubusercontent.com/assets/4001514/4401706/74d3a6ba-4490-11e4-9a32-1b7bb8462778.png)


Sau đó next


![](https://cloud.githubusercontent.com/assets/4001514/4401702/7019e97c-4490-11e4-8160-e0318cd26764.png)


Sau khi cài đặt xong plugin ADT ta tiếp tục cài đặt SDK, sau khi nhấn finish thì sẽ có màn hình download SDK hiện ra như sau:


![](https://cloud.githubusercontent.com/assets/4001514/4401705/706f0f6a-4490-11e4-867a-37c62bb01521.png)


ở đây thì ta đợi cho tải xong SDK và làm theo hướng dẫn chọn next và ok rồi finish


Tiếp đến ta cấu hình cho android Sdk:


Vào Window → preferences → android tại đây ta làm như hình sau:


![](https://cloud.githubusercontent.com/assets/4001514/4401700/700244d4-4490-11e4-9a5b-6227c3311b70.png)












* Các lỗi thường gặp trong quá trình cài đặt:


- Khi dùng lệnh  sudo apt-get install sun-java6-jdk để cài đặt jdk 


vandung@vandung:~$ sudo apt-get install sun-java6-jdk 
[sudo] password for vandung: 
Reading package lists... Done 
Building dependency tree       
Reading state information... Done 
Package sun-java6-jdk is not available, but is referred to by another package. 
This may mean that the package is missing, has been obsoleted, or 
is only available from another source 

E: Package 'sun-java6-jdk' has no installation candidate


Thông báo này nói JDK không tồn tại do máy không thể kết nối trực tiếp tới đại chỉ chứa gói jdk


Hướng giải quyết là ta chạy các lệnh sau: 


`sudo aidd-apt-repository "deb http://archive.canonical.com/ lucid partner"`


`sudo apt-get update`


`sudo apt-get upgrade`


`sudo apt-get install sun-java6-jdk`


+ Tiếp tới là khi bạn nhúng plugin ADT vào eclipse có thể lỗi thì bạn cần download trực tiếp trên trang http://developer.android.com/sdk/installing/installing-adt.html
và nhúng và như hình sau:


![](https://cloud.githubusercontent.com/assets/4001514/4401701/70114772-4490-11e4-9933-cfb31670c76c.png)












Các bạn chọn Archive và dẫn tới thư mục mình vừa tải xuống và finish.

Cách tạo một project android trên eclipse


chọn File → New → Android Application Project
Trong màn hình sau thì nhập các thông tin như tên project, tên package các version api...


![](https://cloud.githubusercontent.com/assets/4001514/4452841/1b57fdf8-484f-11e4-938d-cdb13b0beadd.png)













Xong thì chọn nút Next cho tới khi finish trong các bước đó thì ta có thể chọn icon cho project hay chọn workpace, hay tạo các active...


![](https://cloud.githubusercontent.com/assets/4001514/4401696/6fd2321c-4490-11e4-9f3d-97692e5c7792.png)










Về cấu trúc thư mục của một app android cơ bản có các thành phần như sau:


![](https://cloud.githubusercontent.com/assets/4001514/4401695/6fba9b7a-4490-11e4-90db-154783aa367b.png)


 + SRC: thư mục này chứa các file mã nguồn .java cho dự án của bạn.
+ Gen: Thư mục này chứa file R.java - 1 file được trình biên dịch sinh ra có khả năng tham chiếu tới tất cả các tài nguyên trong dự án. Ta không nên chỉnh sửa file này.
+ Bin: Thư mục này chứa các file *.apk (Android Package file) được build bởi ADT.
+ Res/drawable-hdpi: Đây là thư mục chứa các đối tượng drawble được thiết kế dành cho các màn hình có độ phân giải cao.
+ Res/layout: Đây là thư mục chứa các file layout cho việc thiết kế giao diện.
+ res/values: Đây là thư mục dành cho các file XML khác chứa 1 tập hợp các tài nguyên, ví dụ như: các định nghĩa về strings, colors.
+ AndroidManifest.xml: Đây là file manifest mô tả các đặc điểm cô bản của ứng dụng và định nghĩa các components.

Trong demo trên có 2 file chính mà các bạn cần chú ý khi mới lập trình android


MainActivity.java: file này là file thực thi các sự kiện, hành động(chứa source code)
Trong demo trên tôi làm nhập vào name và khi submit nó thì tên sẽ được hiển thị lại ở chỗ khác gọi tới nó
ví dụ như ta có đoạn mã sau

protected void onCreate(Bundle savedInstanceState) {

  super.onCreate(savedInstanceState);

  setContentView(R.layout.activity_main);

  // lấy các view được khai báo trong file layout(active_main.xml)

  edit = (EditText) findViewById(R.id.edittext);

  text = (TextView) findViewById(R.id.textview);

  button = (Button) findViewById(R.id.button);

  edit.setText(""); hiển thị chuỗi string trên edittext

  button.setOnClickListener(new OnClickListener() {

	@Override

	public void onClick(View v) {

	  text.setText("Hello: " + edit.getText().toString());

	}

});

}


đoạn mã trên thực hiện khi người dùng nhập input name và submit ok thì chúng ta sẽ hiển thị tên mà người dùng vừa nhập vào


active_main.xml: file này chính là file layout của app trong đó thể hiện view của các màn hình


<EditText
	android:id="@+id/edittext"
	android:layout_width="fill_parent"
	android:textColor="#035aa9"
	android:hint="Name"
	android:layout_height="wrap_content" />

	<Button
	android:id="@+id/button"
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:textColor="#035aa9"
	android:layout_gravity="center_horizontal"
	android:text="Submit" />

	<TextView
	android:id="@+id/textview"
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:text="WelCome"
	android:textColor="#ff0000"
	android:textAppearance="?android:attr/textAppearanceLarge" />

Hình ảnh Trước khi submit


![](https://cloud.githubusercontent.com/assets/4001514/4438144/783b1530-47a7-11e4-9ea9-fcc47219bb2b.png)


Hình ảnh sau khi submit


![](https://cloud.githubusercontent.com/assets/4001514/4438145/789825ae-47a7-11e4-8418-75eec930c263.png)


















