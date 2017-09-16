package test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 ** 
7 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		   if(students.length >= 0){
	       for(int i=0;i<students.length;i++){
	    	   if(i==index){
	    		   return students[i];
	    	   }
	       }}else{
	    	   System.out.println("No Students");
	    	   return null;
	       }
		   return null;
	
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int length= students.length;
              length++;
             students[length]=student; 
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
     students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		List<Student> stslist=getStudentList(students);
		stslist.remove(index);
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		List<Student> stslist=getStudentList(students);
		int count=0;
		for(Student std:stslist){
			count++;
			int i=std.compareTo(student);
			if(i==1){
			  stslist.remove(count);
			  int c=0;
				for(Student stdt:stslist){
					students[c]=stdt;
							c++;
				}
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		List<Student> stslist=getStudentList(students);
		stslist.remove(index);
		int count=0;
		for(Student std:stslist){
			students[count]=std;
					count++;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		List<Student> stslist=getStudentList(students);
		int count=0;
		for(Student std:stslist){
			count++;
			int i=std.compareTo(student);
			if(i==1){
			  stslist.remove(count);
			  int c=0;
				for(Student stdt:stslist){
					students[c]=stdt;
							c++;
				}
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		List<Student> stslist=getStudentList(students);
		stslist.remove(index);
		int count=0;
		for(Student std:stslist){
			students[count]=std;
					count++;
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		List<Student> stslist=getStudentList(students);
		int count=0;
		for(Student std:stslist){
			count++;
			int i=std.compareTo(student);
			if(i==1){
			  stslist.remove(count);
			  int c=0;
				for(Student stdt:stslist){
					students[c]=stdt;
							c++;
				}
			}
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		Student stss[] = null;
		List<Student> stslist=getStudentList(students);
		int c=0;
		for(Student std:stslist){
              if(std.getBirthDate().equals(date)){
            	  c++;
            	  stss[c]=std;
              }}
		return stss;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}

	
	// new method defined 
public List<Student> getStudentList(Student[] stds){
	List<Student> stdlist=new ArrayList<Student>();
	for(int i=0;i<stds.length;i++){
		stdlist.add(stds[i]);
	}
	return stdlist;
}	
}
