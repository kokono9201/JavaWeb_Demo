Database
Object
    Book
    User
    OrderBean
    OrderItem
    CartItem

Properties
    Book: BookName, Author, Price, SaleCount, BookCount, BookImg, Status
    User: UserName, Password, Email, Role
    OrderBean: OrderSerial, OrderDate, OrderPrice, OrderNumber, OrderStatus
    OrderItem: Book, Number, OrderBean (one book for one item, orderBean can have several orderItems)
    CartItem: Book, Number, User (like orderItem)

1. show index
2. show user information after login
3. add buy item into cart
4. show cart list
5. submit purchase
    1) create new order
    2) add cart information to order
    3) clear cart
