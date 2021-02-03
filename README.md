# Bài tập cuối khóa CleanCode - Luvina JSC 2020
# Học viên: Nguyễn Trọng Hiệp


## Tự Luận

### Phần 1: Clean Code căn bản

#### 1. 5 mục tiêu chính của Clean Code là:
 - Giúp Source Code sạch sẽ, gọn gàng hơn, cảm thấy hứng thú khi đọc. Giống như khi bạn chăm chú đọc một bài văn hay vậy. 
 - Giúp Code có tâm điểm (focus) : Mỗi fucntion, mỗi class, mỗi module chỉ thực hiện một chức năng duy nhất, không bị phân tán, bởi các context xung quanh.
 - Clean code thì được trau chuốt, người code ra nó đã dành thời gian đển giữ cho nó đơn giản và có trật tự nhất có thể.
 - Giúp Code chạy tốt với tất cả các case : Đôi khi các function được tạo ra chỉ chạy tốt trên các case bình thường, còn các case bất thường thì xảy ra lỗi.
 - Giúp tối ưu số lượng các class, method, function ...

#### 2. Nếu em là TeamLead, em sẽ chọn phương án của Team C: Áp dụng Clean Code là một quá trình. Quy tắc nào dễ hiểu, dễ nhớ thì áp dụng trước. Những kỹ thuật phức tạp sẽ học và áp dụng trong tình huống phù hợp. Cân bằng giữa tiến độ và clean code.
  - Giải thích: Việc cân bằng tiến độ là rất quan trọng trong dự án, cho nên các quy tắc cleancode dễ sẽ được áp dụng trước. Sau đó trong quá trình phát triển nếu team cẩm thấy áp dụng được các kỹ thuật cleancode vào chức năng nào đó (hoặc được yêu cầu từ khách hàng) thì sẽ tiến hành "đào sâu" vào áp dụng kỹ thuật đó vào dự án. Không nên giành thời gian cho những ý tưởng quá cao siêu trong khi dự án không cần thiết khoặc khách hàng không yêu cầu.

#### 3. Nếu em là một TeamLead, khi bạn giới thiệu các quy tắc Clean Code cho các đồng đội trẻ. Có một số bạn cho rằng Clean Code chỉ làm phức tạp thêm vấn đề, và chậm lại hiệu suất làm việc của nhóm. Em sẽ giải thích như sau:
 - Thứ nhất, CleanCode (đúng kỹ thuật) sẽ giúp chúng ta giải quyết các vấn đề một cách linh hoạt và rõ ràng hơn. Điều này đã được minh chứng trong thực tế.
 - Thứ hai, CleanCode làm phức tạp hóa vấn đề? Đúng, nó có thể làm phức tạp hóa một vấn đề bình thường. Nhưng đó là trong trường hợp chúng ta không sử dụng nó đúng cách hoặc quá lạm dụng CleanCode để giải quyết một vấn đề.
 - Tóm lại, vấn đề của chúng ta ở đây đó là: hiểu rõ bản chất và mục đích của CleanCode để rồi áp dụng vào các vấn đề trong dự án. Từ việc tìm hiểu rõ và đúng về CleanCode thì chúng ta có thể cùng nhau xây dựng một sản phẩm có tính đúng đắn và đồng nhất hơn trong thực tế.

#### 4. Trong 4 đề xuất cho phương thức tính lương thì đề xuất của Vân là phù hợp với quy ước trong CleanCode.

#### 5. [Mã nguồn phần 1](https://github.com/hiepsummer98/CleanCode_TestHomeWork/tree/main/sourcecode/phan1)

### Phần 2: [Mã nguồn phần 2](https://github.com/hiepsummer98/CleanCode_TestHomeWork/tree/main/sourcecode/phan2)
### Phần 3: [Mã nguồn phần 3](https://github.com/hiepsummer98/CleanCode_TestHomeWork/tree/main/sourcecode/phan3)
### Phần 4: [Mã nguồn phần 4](https://github.com/hiepsummer98/CleanCode_TestHomeWork/tree/main/sourcecode/phan4)
### Phần 5: [Mã nguồn phần 5](https://github.com/hiepsummer98/CleanCode_TestHomeWork/tree/main/sourcecode/phan5)

## Trắc nghiệm
1. Điều nào không đúng khi nói về Design Pattern?
  ```
   C. Đã được thiết kế và cài đặt ở mức chi tiết.
  ```
---

2. Các OOP Design Pattern được chia làm mấy nhóm?
  ```
   B. 3
  ```
---

3. Các design pattern của nhóm Behavioral pattern có đặc điểm nào dưới đây?
  ```
   D. Quan tâm đến cách giao tiếp giữa các lớp và các đối tượng.
  ```
---

4. Trong trường hợp client muốn khởi tạo một đối tượng mà không cần quan tâm logic khởi tạo đối tượng hoặc không biết rõ lớp của đối tượng thì chúng ta nên áp dụng design pattern nào đã được học?
  ```
   C. Factory Method
  ```
---

5. Cách cài đặt Bill Pugh của Singleton pattern có đảm bảo thread-safe hay không?
  ```
   A. Có
  ```
---

6. Đối tượng được khởi tạo bằng Builder pattern có điểm gì khác biệt so với đối tượng được khởi tạo bằng cách thông thường (thông qua toán tử new, rồi sau đó set các giá trị thông qua setter method)?
  ```
   B. Immutable
  ```
---

7. Khi sử dụng annotation @Builder của Lombok thì đối tượng được khởi tạo có đảm bảo immutable hay không?
  ```
   A. Không
  ```
---

8. Trong design pattern Flyweight, chúng ta lưu trữ loại dữ liệu nào trong bộ nhớ cache (flyweight factory)?
  ```
   A. Dữ liệu không thay đổi theo context
  ```
---

9. Nếu có nhiều class chứa các thuật toán gần như giống hệt nhau và chỉ có một số ít khác biệt, thì chúng ta sẽ áp dụng design pattern nào đã được học để tránh bị lặp lại code, cũng như tốn ít công sức sửa code nếu có yêu cầu phải thay đổi tất cả các thuật toán?
  ```
   B. Template Method
  ```
---

10. Một tác vụ có nhiều thuật toán để xử lý. Để dễ dàng chuyển đổi thuật toán tại thời điểm chạy chương trình tùy theo request từ phía client, chúng ta sẽ áp dụng design pattern nào đã được học?
  ```
   A. Strategy
  ```
---

11. REST là gì?
  ```
   B. Kiểu kiến trúc phần mềm
  ```
---

12. Đâu không phải là đặc điểm của một hệ thống RESTful?
  ```
   C. Server lưu trữ session và history của client.
  ```
---

13. Khi RESTful API có nhiệm vụ thêm mới một resource, chúng ta nên sử dụng HTTP method nào?
  ```
   B. POST
  ```
---

14. HTTP method nào không đảm bảo idempotent trong tất cả các trường hợp?
  ```
   B. POST
  ```
---

15. Chúng ta nên sử dụng query parameter cho những trường hợp nào?
  ```
   D. Cả 3 đáp án trên
  ```
---

16. Các interface/class có nhiệm vụ thao tác với cơ sở dữ liệu được đặt ở layer nào?
  ```
   B. Repository
  ```
---

17. Các bạn đã được tìm hiểu mấy phương pháp đánh version cho RESTful API trong khóa học?
  ```
   D. 4
  ```
---

18. Trong Spring Framework, phương pháp xử lý lỗi nào dưới đây cho phép chúng ta xử lý lỗi ở mức toàn ứng dụng (global)?
  ```
   B. Chỉ sử dụng @ExceptionHandler
  ```
---

19. Để thông báo cho người quản trị hệ thống biết một chức năng đã gặp lỗi, chúng ta nên sử dụng log level nào?
  ```
   C. ERROR
  ```
---

20. Để cảnh báo việc tiến trình có thể không chạy đúng với logic, nhưng ứng dụng vẫn có thể tiếp tục, chúng ta nên sử dụng log level nào?
  ```
   B. WARN
  ```
---

21. Có phải method được đánh dấu annotation @Cacheable luôn được thực thi mỗi khi RESTful API được gọi?
  ```
   B. Không
  ```
---

22. Anti-pattern Jaywalking phù hợp trong trường hợp nào?
  ```
   C. A và B.
  ```
---

23. Đâu không phải là giải pháp phù hợp để thay thế cho anti-pattern Multi-column Attributes? Giả sử tôi cần lưu các tag của một article.
  ```
   A. Tạo một bảng trung gian (join table) giữa tag và article.
  ```
---

24. Nếu sử dụng anti-pattern Entity-Value-Attribute, giả sử đối tượng có 5 thuộc tính, vậy tôi cần thực hiện tất cả bao nhiêu phép JOIN để lấy đủ thông tin của 5 thuộc tính?
  ```
   B. 3
  ```
---

25. Tree model nào không dễ để query child node ngay dưới?
  ```
   C. Nested Set
  ```