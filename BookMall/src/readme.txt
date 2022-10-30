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
