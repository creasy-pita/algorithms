2017-10-28
	**�����㷨�ķ�ʽ��
	�������㷨��ԭʼ������� 
	һС�δ�����Ϊһ�����뵥Ԫ ��Ϊһ������
	������ �����ı仯 ��Ϊһ������
	������ �����㷨�ıȽ���Ϊһ������ �ۺϿ��� �����з���
	**��λ�����ַ�������LSD
	1 a[i].charAt(d) Ϊstring[] a�е�i��string��dλ��ֵ������
	2 count[r] rλ�õ�����ֵ��������¼ ����r��string[] a�е�λ�á�
	�ؼ� ��count[r]�ļ���������ӳ�� ��ϵ�Ĵ���
	** ��λ�����ַ��������㷨
	1 �����Ϸ���  ���� int[] count=new int[R+1] С�������Ӱ��, �Ľ�ʹ����ֵm��ת��Ϊ ��������
	2 �����ظ��ַ��� �ҳ������򷽷��л������������㣬������Ҫÿһλ�Ͻ��м�飬����ַ������޴�
	3 ����ַ���
	4 �ַ����� Alphabet.ASCII��Alphabet��Unicode ��Ӱ��
	   a  int[] count=new int[R+1] �����󣬿ռ������󣻱����ĳ�������
	   
	   ��׼�����밴 ctrl+z��������
2017-9-28
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