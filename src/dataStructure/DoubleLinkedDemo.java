package dataStructure;

/**
 * @className:DoubleLinkedDemo
 * @description: 双链表讲解
 * @author: renhai
 * @create: 2021-09-18 23:43
 */
public class DoubleLinkedDemo {
    public static void main(String[] args) {
        //进行测试
        //先创建节点
        HeroNode2 hero1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 hero2 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 hero3 = new HeroNode2(3, "吴用", "智多星");
        HeroNode2 hero4 = new HeroNode2(4, "林冲", "豹子头");
        //创建链表
        SingleLinked2 singleLinkedList = new SingleLinked2();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        singleLinkedList.listHero();
        HeroNode2 hero5 = new HeroNode2(3, "Sherry", "灰原哀");
        singleLinkedList.delete(hero5);
        singleLinkedList.listHero();
        singleLinkedList.addOrder(hero5);
        singleLinkedList.listHero();
        HeroNode2 hero6 = new HeroNode2(3, "renhai", "小源");
    }
}

class SingleLinked2 {
    private HeroNode2 head = new HeroNode2(0, "", "");//得到双向链表的头节点

    //返回头节点
    public HeroNode2 getHead() {
        return head;
    }

    //添加英雄
    public void add(HeroNode2 hero) {
        HeroNode2 temp = head;
        //当退出while循环时找到链表的尾部元素
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(hero);
        hero.setPre(temp);
    }

    //插入英雄按照顺序
    public void addOrder(HeroNode2 hero) {
        HeroNode2 temp = head;
        boolean flag = false;
        while (true) {
            if (temp.getNext() == null) {//空链表
                break;
            } else if (temp.getNext().getNo() == hero.getNo()) {
                flag = true;
                break;
            } else if (temp.getNext().getNo() > hero.getNo()) {
                break;
            }
            temp = temp.getNext();
        }
        if (flag) {
            System.out.println("该英雄已存在");
        } else {
            hero.setNext(temp.getNext());
            temp.getNext().setPre(hero);
            temp.setNext(hero);
            hero.setPre(temp);
        }
    }

    //删除链表的某一个元素
    public void delete(HeroNode2 hero) {
        HeroNode2 temp = head.getNext();
        boolean flag = false;
        while (true) {
            if (temp == null) {
                System.out.println("链表为空");
                break;
            } else if (temp.getNo() == hero.getNo()) {
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag) {
            temp.getPre().setNext(temp.getNext());
            temp.getNext().setPre(temp.getPre());
        } else {
            System.out.println("没有找到该英雄");
        }
    }

    //打印链表
    public void listHero() {
        //判断链表是否为空
        if (head.getNext() == null) {
            System.out.println("链表为空");
            return;
        }
        //因为头节点，不能动，因此我们需要一个辅助变量来遍历
        HeroNode2 temp = head.getNext();
        while (true) {
            //判断是否到链表最后
            if (temp == null) {
                break;
            }
            //输出节点的信息
            System.out.println(temp);
            //将temp后移， 一定小心
            temp = temp.getNext();
        }
    }


}


/**
 * @Author renhai
 * @Description 英雄类
 * @Date 21:00 2021/9/17
 **/
class HeroNode2 {
    private int no;
    private String name;
    private String nickName;
    private HeroNode2 next;
    private HeroNode2 pre;

    public HeroNode2(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public HeroNode2 getPre() {
        return pre;
    }

    public void setPre(HeroNode2 pre) {
        this.pre = pre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setNext(HeroNode2 next) {
        this.next = next;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public HeroNode2 getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}