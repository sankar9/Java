#Bean Classes
User{
	String Userid
	String  Password
	String firstname
	String lastname
	char Gender
	Date dob
	Date date of joining
	String designation
	long phone number
	String email
	String address
	String role
}

Student{
	String Userid
	String RollNumber
	int ClassCode
	String firstname
	String lastname
	char Gender
	String Fathername
            String Mothername
	Date dob
	Date dateOfJoining
	long phoneNumber
	String email
	String address
	String role
	String Parentid
}

Report{
	String userId
	String firstName
	String lastName
	int classCode
	List<Subject> subjects
	int total
	char grade
	float Percentage
	String status
	String parent status
}
Class{
	int classCode
	String className
	String teacherCode
	int cirriculumCode
	int maxStrength
	int strength
}

Cirriculum{
	int cirriculumCode
	String cirriculumName
	List<Subject> subje cts
}
Subject{
	int subjectId
	String subjectName
	int marks
}
#Services
PrincipalService{
	int addTeacher(Teacher teacher);
	void viewTeachers();
	int updateTeacher(Teacher teacher);
	int assignClassTeacher(String teacherid, int classid);
	int updateClassTeacher(String teacherid, int classid);
	int addClass(Class class);
	void viewClasses();
	int updateClass(Class class);
	int addSubjects(Subject subject);
	void viewSubjects();
	int updateSubjects(Subject subject);
	void viewReportStatus();
	void viewReports(String status);
	void viewReports(String status,int classcode);
	void viewReports(int classcode);
	void viewStudents();
	void viewStudent(String userid);
	void viewStudent(String lastname);
}

ClassTeacherService{
	int addStudent(Student student);
	int updateStudent(Student student);
	void viewStudents(int classid);
	void viewStudent(String userid);
	void viewStudent(String lastname);
	int addReport(Report report);
	void viewReports();
	void viewReport(String userid,int classcode,int examid);
	int updateReport(Report report);
}

ParentService{
	void viewWardReport(String userid,int examid);
	int signReport(String userid,int examid);
}

AuthenticationService{
	int login(String userid,String password);
	int changePassword(String userid,String password);
	String getRole(String userid);
	String getName(String userid);
}

#ServicesImpl
PrincipalServiceImpl{
	int addTeacher(Teacher teacher){}
	void viewTeachers(){}
	int updateTeacher(Teacher teacher){}
	int assignClassTeacher(String teacherid, int classid){}
	int updateClassTeacher(String teacherid, int classid){}
	int addClass(Class class){}
	void viewClasses(){}
	int updateClass(Class class){}
	int addSubjects(Subject subject){}
	void viewSubjects(){}
	int updateSubjects(Subject subject){}
	void viewReportStatus(){}
	void viewReports(String status){}
	void viewReports(String status,int classcode){}
	void viewReports(int classcode){}
	void viewStudents(){}
	void viewStudent(String userid){}
	void viewStudent(String lastname){}
}

ClassTeacherService{
	int addStudent(Student student){}
	int updateStudent(Student student){}
	void viewStudents(int classid){}
	void viewStudent(String userid){}
	void viewStudent(String lastname){}
	int addReport(Report report){}
	void viewReports(){}
	void viewReport(String userid,int classcode,int examid){}
	int updateReport(Report report){}
}

ParentService{
	void viewWardReport(String userid,int examid){}
	int signReport(String userid,int examid){}
}

AuthenticationService{
	int login(String userid,String password){}
	int changePassword(String userid,String password){}
	String getRole(String userid){}
	String getName(String userid){}
}

#Dao’s

PrincipalDao{
	int assignClassTeacher(String teacherid, int classid);
	int updateClassTeacher(String teacherid, int classid);
	int addClass(Class class);
	void viewClasses();
	int updateClass(Class class);
	int addCirriculum(Cirriculum cirriculum);
	void viewCirricula();
	int updateCirriculum(Cirriculum cirriculum);
}

ClassReportDao{
	int addReport(Report report);
	void viewReportStatus();
	void viewReports(String status);
	void viewReports(String status,int classcode);
	void viewReports(int classcode);
	void viewReport(String userid,int classcode,int examid);
	void viewWardReport(String userid,int examid);
	int signReport(String userid,int examid);
	int updateReport(Report report);
	int updateReport(String userid,int classcode,int examid, String status);
}

AuthenticationDao{
	int login(String userid,String password);
	int changePassword(String userid,String password);
	String getRole(String userid);
	String getName(String userid);
}
Class UserDao{
	int addUser(Student student);
	int updateUser(Student student);
	void viewUsers(int classid);
	void viewUser(String userid);
	void viewUsers(String firstname);
}
#DaoImpl
PrincipalDaoImpl{
	int assignClassTeacher(String teacherid, int classid){}
	int updateClassTeacher(String teacherid, int classid){}
	int addClass(Class class){}
	void viewClasses(){}
	int updateClass(Class class){}
	int addCirriculum(Cirriculum cirriculum){}
	void viewCirricula(){}
	int updateCirriculum(Cirriculum cirriculum){}
}

ClassReportDaoImpl{
	int addReport(Report report){}
	void viewReportStatus(){}
	void viewReports(String status){}
	void viewReports(String status,int classcode){}
	void viewReports(int classcode){}
	void viewReport(String userid,int classcode,int examid){}
	void viewWardReport(String userid,int examid){}
	int signReport(String userid,int examid){}
	int updateReport(Report report){}
	int updateReport(String userid,int classcode,int examid, String status){}
}

AuthenticationDaoImpl{
	int login(String userid,String password){}
	int changePassword(String userid,String password){}
	String getRole(String userid){}
	String getName(String userid){}
}
Class UserDaoImpl{
	int addUser(Student student){}
	int updateUser(Student student){}
	void viewUsers(int classid){}
	void viewUser(String userid){}
	void viewUsers(String firstname){}`` 
}
