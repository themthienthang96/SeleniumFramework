Update ngày 23/02/2022
I/ Điều kiện tiên quyết

1/ Java

2/ Maven

3/ Selenium/Webdriver

4/ TestNG

5/ Browsers (Chrome,Firefox)

6/ IntellliJ

7/ Browser Driver

8/ Allure Report 

II/ Định nghĩa từng thư mục 

- Main > Java > FunctionExample : Lưu các Testcase các Function mẫu 

- Main > Java > Pages : Xử lý các Function của 1 trang

- Main > Java > Utility > Base: Chứa Core khởi động trước và sau của TestCase và chương trình

- Main > Java > Utility > Services : Chứa các Service dùng để gọi lại trong các Pages để sử dụng

- Test > java > TestCases :  Chứa các TestCase 

- Pom.xml : Chứa các Packages và Maven bổ trợ

- Testng.xml : Chạy Testcase theo từng nhóm 

III/ Cách sử dụng
1/ Cập nhật Maven trong file pom.xml và xác nhận Java KitTool (Hiện tại đang sử dụng 16)

2/ Trong class Base, cập nhật lại path cho driver và URL test tùy từng dự án 

3/ Tạo từng Pages riêng trong folder Pages 

4/ Tạo từng Testcase trong folder Testcase

5/ Gọi lại trong file testng.xml và chạy testng.xml

6/ Cài đặt Enviroment Path dẫn tới thư mục bin của Allure Report

7/ Chạy kiểm tra allure report => allure --version

8/ Trong cmd run => allure serve (Path dẫn tới thư mục allure-results)

----
Quay lại bước 4 

## _Coverage:_

| Nội dung                  |                                 | Status |
|---------------------------|---------------------------------|--------|
|                           |                                 |        |
| Framework level           | Page Object Model               | Done   |
|                           | Profiles                        | Done   |
|                           | Grids                           |        |
|                           | Cross browsers & cross platform |        |
|                           |                                 |        |
| Locators                  | Learning how to get locators.   |        |
|                           |                                 |        |
| Functionality To Automate | Challenging DOM                 | Done   |
|                           | Checkboxes                      | Done   |
|                           | Context Menu                    | Done   |
|                           | Disappearing Elements           | Done   |
|                           | Drag and Drop                   | Done   |
|                           | Dropdown                        | Done   |
|                           | Dynamic Content                 | Done   |
|                           | Dynamic Controls                | Done   |
|                           | Dynamic Loading                 | Done   |
|                           | File Download                   | Done   |
|                           | File Upload                     | Done   |
|                           | Floating Menu                   | Done   |
|                           | Frames                          | Done   |
|                           | Horizontal Slider               | Done   |
|                           | Hovers                          | Done   |
|                           | Infinite Scroll                 | Done   |
|                           | JQuery UI Menus                 | Done   |
|                           | JavaScript Alerts               | Done   |
|                           | Key Presses                     | Done   |
|                           | Large & Deep DOM                | Done   |
|                           | Multiple Windows                | Done   |
|                           | Nested Frames                   | Done   |
|                           | ToolTip                         | Done   |
|                           | Notification Messages           |        |
|                           | Redirect Link                   |        |
|                           | Shifting Content                |        |
