INSERT INTO LibraryItem (ItemID, Title, Author, Type)
VALUES ('LIB001', 'The Lord of the Rings', 'J.R.R. Tolkien', 'Book');

INSERT INTO LibraryItem (ItemID, Title, Author, Type)
VALUES ('LIB002', 'Pride and Prejudice', 'Jane Austen', 'Book');

INSERT INTO LibraryItem (ItemID, Title, Author, Type)
VALUES ('LIB003', 'The Shawshank Redemption', 'Stephen King', 'DVD');

INSERT INTO Student (UserName, Password, EmailAddress, Name, ContactInformation, Birthday)
VALUES ('s12345', 'secret123', 'john.doe@email.com', 'John Doe', '123 Main St, Anytown', '1990-01-01');

INSERT INTO Student (UserName, Password, EmailAddress, Name, ContactInformation, Birthday)
VALUES ('s54321', 'securepass', 'jane.smith@email.com', 'Jane Smith', '456 Elm St, Anytown', '1995-02-15');

INSERT INTO Payment (PaymentID, StudentID, DateOfPayment, Amount, PaymentMethod, Description)
VALUES ('PAY001', 's12345', '2024-05-24', 10.00, 'Credit Card', 'Late fee payment');

INSERT INTO Specialization (SpecID, SpecName, Description, FieldOfStudy)
VALUES ('SPEC001', 'Computer Science', 'Study of computers and computational systems', 'Technology');

INSERT INTO Specialization (SpecID, SpecName, Description, FieldOfStudy)
VALUES ('SPEC002', 'English Literature', 'Study of literature written in English', 'Humanities');

INSERT INTO Subject (SubjectID, SubjectName, Lecturer, Description)
VALUES (1, 'Software Engineering', 'Dr. Jones', 'Principles of software design and development');

INSERT INTO Subject (SubjectID, SubjectName, Lecturer, Description)
VALUES (2, 'British Literature', 'Professor Smith', 'Study of major British literary works');

INSERT INTO TimetableSlot (Day, Time, Classroom, SubjectID)
VALUES ('Monday', '10:00 AM', 'Lecture Hall 1', 1);

INSERT INTO TimetableSlot (Day, Time, Classroom, SubjectID)
VALUES ('Wednesday', '2:00 PM', 'Lecture Hall 2', 1);

INSERT INTO Borrowing (StudentID, LibraryItemID, BorrowingDate, DueDate, ReturnDate)
VALUES ('s12345', 'LIB001', '2024-05-20', '2024-06-03', NULL);
