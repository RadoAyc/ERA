drop table LibraryItem if exists;
CREATE TABLE LibraryItem (
  ItemID VARCHAR(255) PRIMARY KEY,
  Title VARCHAR(255),
  Author VARCHAR(255),
  Type VARCHAR(255)
);
drop table Student if exists;

CREATE TABLE Student (
  UserName VARCHAR(255) PRIMARY KEY,
  Password VARCHAR(255),
  EmailAddress VARCHAR(255),
  Name VARCHAR(255),
  ContactInformation VARCHAR(255),
  Birthday DATE
);
drop table Payment if exists;

CREATE TABLE Payment (
  PaymentID VARCHAR(255) PRIMARY KEY,
  StudentID VARCHAR(255),
  DateOfPayment DATE,
  Amount DOUBLE,
  PaymentMethod VARCHAR(255),
  Description VARCHAR(255),
  FOREIGN KEY (StudentID) REFERENCES Student(UserName)
);
 drop table Specialization if exists;

CREATE TABLE Specialization (
  SpecID VARCHAR(255) PRIMARY KEY,
  SpecName VARCHAR(255),
  Description VARCHAR(255),
  FieldOfStudy VARCHAR(255)
);
drop table Subject if exists;

CREATE TABLE Subject (
  SubjectID INT PRIMARY KEY,
  SubjectName VARCHAR(255),
  Lecturer VARCHAR(255),
  Description VARCHAR(255)
);
drop table TimetableSlot if exists;

CREATE TABLE TimetableSlot (
  Day VARCHAR(255),
  Time VARCHAR(255),
  Classroom VARCHAR(255),
  SubjectID INT,
  FOREIGN KEY (SubjectID) REFERENCES Subject(SubjectID)
);
drop table Borrowing if exists;

CREATE TABLE Borrowing (
  StudentID VARCHAR(255),
  LibraryItemID VARCHAR(255),
  BorrowingDate DATE,
  DueDate DATE,
  ReturnDate DATE,
  FOREIGN KEY (StudentID) REFERENCES Student(UserName),
  FOREIGN KEY (LibraryItemID) REFERENCES LibraryItem(ItemID)
);




