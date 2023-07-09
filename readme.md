
### 2023-07-08

#### 冒泡排序

**易错点**：

for (int i = 0; i < a.length; i++)；  表示从0遍历到最后一个元素，遍历`n`次

for (int i = 0; i < a.length - 1 ; i++)；**表示从0遍历到倒数第二个元素**，**这种刚好适用**这里的场景，遍历`n-1`

**难点**

遍历的作用不像常规的场景，这里的遍历的作用时说明右侧排好了多少个最大元素，所以相较于常规场景的遍历，它的边界就比较难把握；
外层循环的i理解为目前排好了多少个最大元素；排好`n-1`个最大元素，最后一个也就排好序了，所以只需要遍历`n-1`趟
内层循环的j理解为相邻比较的左边的这个元素的下标，他的边界应该是a.length - i - 1;即总长度 - 1 - 已经排好的最大元素个数
比如  i=0,a.length=4时，j < 3,这样a[j+1]就是最后一个元素，不会越界。

### 2017-10-28
**分析算法的方式：
分析从算法的原始代码出发
一小段代码作为一个代码单元 作为一个因素
代码中 变量的变化 作为一个因素
与其他 已有算法的比较作为一个因素 综合考虑 来进行分析
**低位优先字符串排序LSD
1 a[i].charAt(d) 为string[] a中第i个string第d位的值（键）
2 count[r] r位置的整数值上用来记录 键的r在string[] a中的位置。
关键 在count[r]的键与索引的映射 关系的处理。
** 高位优先字符串排序算法
1 性能上分析  比如 int[] count=new int[R+1] 小型数组的影响, 改进使用阈值m内转换为 快速排序
2 大量重复字符串 找出的排序方法切换条件不能满足，近似于要每一位上进行检查，检查字符次数巨大
3 检查字符的
4 字符集从 Alphabet.ASCII到Alphabet，Unicode 的影响
a  int[] count=new int[R+1] 数组变大，空间需求变大；遍历的长度增大

	   标准输入请按 ctrl+z结束输入
2017-9-28
加入比较器 Comparable 与 Comparator比较
1 实现 Comparable 接口 ,需要内部 实现compareTo方法
比如
private static class Person implements Comparable<Person>{
..
..
..
@Override
public int compareTo(Person person) {
return name.compareTo(person.name);
}
}
2 传入 Comparator ，外部指定
比如
/**
* @desc DescAgeComparator比较器
*    它是“Person的age的升序比较器”
     */
     private static class DescAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
      return p2.getAge() - p1.getAge();
    }
}

3 优缺点： 通过 Comparator的优势 可以灵活指定使用
4 两者的结合，只需要实例化是指定 哪一类比较器，通过调用compareTo 完成比较

private static class Person implements Comparable<Person>{
Comparator comparator = null;
//方法设置比较器
public void SetComparator(Comparator comparator){
this.comparator = comparator;
}
//构造是设置比较器
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