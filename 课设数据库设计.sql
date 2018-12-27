
create database money;  
use money; 

CREATE TABLE user
(    
     UserID  VARCHAR(10) NOT NULL,
     UserName VARCHAR(12) NOT NULL,
     UserPassword VARCHAR(130) NOT NULL,
     UserEmail varchar(20),
     UserSex  varchar(6),
     UserJob varchar(30),
     UserGrade	INTEGER(1) NOT NULL,
		 PRIMARY KEY(UserID)		 		 
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE income
(
    
	   incomeID VARCHAR(10) NOT NULL,
	   incomeName VARCHAR(10) NOT NULL,
	   PRIMARY KEY(incomeID)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE incomeRecoder
(
     RecordID VARCHAR(10) NOT NULL,
		 UserID  VARCHAR(10) NOT NULL,
		 incomeID VARCHAR(10) NOT NULL,
		 incomeAmount DOUBLE(8,2) NOT NULL,
		 Date datetime(3) NOT NULL,
		 PRIMARY KEY(RecordID),
	   FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`),
	   FOREIGN KEY (`incomeID`) REFERENCES `income` (`incomeID`)	 	 
		 
)ENGINE=InnoDB DEFAULT CHARSET=utf8;






CREATE TABLE consume
(
   ConsumeID VARCHAR(10) NOT NULL,
	 ConsumeName VARCHAR(10) NOT NULL,
	 PRIMARY KEY(ConsumeID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE consumeRecoder
(
     RecordID VARCHAR(10) NOT NULL,
		 UserID  VARCHAR(10) NOT NULL,
		 ConsumeID VARCHAR(10) NOT NULL,
		 Cost DOUBLE(8,2) NOT NULL,
		 Date datetime(3) NOT NULL,
		 PRIMARY KEY(RecordID),
	   FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`),
	   FOREIGN KEY (`ConsumeID`) REFERENCES `consume` (`ConsumeID`)	 	 
		 
)ENGINE=InnoDB DEFAULT CHARSET=utf8;









