
����Ƚ��� Comparable �� Comparator�Ƚ�
1 ʵ�� Comparable �ӿ� ,��Ҫ�ڲ� ʵ��compareTo����
����
 private static class Person implements Comparable<Person>{
	 ..
	 ..
	 ..
    @Override
    public int compareTo(Person person) {
      return name.compareTo(person.name);
    }
}
2 ���� Comparator ���ⲿָ��
���� 
  /**
   * @desc DescAgeComparator�Ƚ���
   *    ���ǡ�Person��age������Ƚ�����
   */
  private static class DescAgeComparator implements Comparator<Person> {
 
    @Override
    public int compare(Person p1, Person p2) {
      return p2.getAge() - p1.getAge();
    }
  }
  
 3 ��ȱ�㣺 ͨ�� Comparator������ �������ָ��ʹ��
 4 ���ߵĽ�ϣ�ֻ��Ҫʵ������ָ�� ��һ��Ƚ�����ͨ������compareTo ��ɱȽ�
 
 private static class Person implements Comparable<Person>{
	 Comparator comparator = null;
	 //�������ñȽ���
	 public void SetComparator(Comparator comparator){
		this.comparator = comparator;
	 }
	 //���������ñȽ���
	 public Person(Comparator comparator){
		this.comparator = comparator;
	 }
	 ..
	 ..
    @Override
    public int compareTo(Person person) {
		return comparator.compare(this, person);
      //return name.compareTo(person.name);
    }
}