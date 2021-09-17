package dataStructure;

/**
 * @className:singleLinked
 * @description: 单链表讲解
 * @author: renhai
 * @create: 2021-09-17 9:10
 */
public class SingleLinkedDemo {
    public static void main(String[] args) {
        //进行测试
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建要给链表
        SingleLinked singleLinkedList = new SingleLinked();


        //加入
        singleLinkedList.addOrder(hero1);
        singleLinkedList.addOrder(hero2);
        singleLinkedList.addOrder(hero3);
        singleLinkedList.addOrder(hero4);

        revSingleLinked(singleLinkedList.getHead());

        // 测试一下单链表的反转功能
//        System.out.println("原来链表的情况~~");
        singleLinkedList.listHero();
       // System.out.println(getLength(singleLinkedList.getHead()));
      //  System.out.println(getLastHeroNode(singleLinkedList.getHead(), 1));
        //singleLinkedList.delete(hero1);
        //System.out.println();
        //singleLinkedList.listHero();
//		System.out.println("反转单链表~~");
//		reversetList(singleLinkedList.getHead());
//		singleLinkedList.list();

//        System.out.println("测试逆序打印单链表, 没有改变链表的结构~~");
//        reversePrint(singleLinkedList.getHead());

/*
		//加入按照编号的顺序
		singleLinkedList.addByOrder(hero1);
		singleLinkedList.addByOrder(hero4);
		singleLinkedList.addByOrder(hero2);
		singleLinkedList.addByOrder(hero3);

		//显示一把
		singleLinkedList.list();

		//测试修改节点的代码
		HeroNode newHeroNode = new HeroNode(2, "小卢", "玉麒麟~~");
		singleLinkedList.update(newHeroNode);

		System.out.println("修改后的链表情况~~");
		singleLinkedList.list();

		//删除一个节点
		singleLinkedList.del(1);
		singleLinkedList.del(4);
		System.out.println("删除后的链表情况~~");
		singleLinkedList.list();

		//测试一下 求单链表中有效节点的个数
		System.out.println("有效的节点个数=" + getLength(singleLinkedList.getHead()));//2

		//测试一下看看是否得到了倒数第K个节点
		HeroNode res = findLastIndexNode(singleLinkedList.getHead(), 3);
		System.out.println("res=" + res);
*/
    }

    //获取单链表的节点的个数(如果是带头节点的链表，需求不统计头节点)
    public static int getLength(HeroNode head) {
        int length = 0;
        if (head.getNext() == null) {
            return 0;
        }
        HeroNode cur = head.getNext();
        while (cur != null) {
            length++;
            cur = cur.getNext();
        }
        return length;
    }

    //找到链表倒数第K个节点
    public static HeroNode getLastHeroNode(HeroNode hero, int index) {
        if (hero.getNext() == null) {
            return null;
        }
        int len = getLength(hero);
        HeroNode temp = hero.getNext();
        if (index <= 0 || index > len) {
            return null;
        } else {
            for (int i = 0; i < len - index; i++) {
                temp = temp.getNext();
            }
        }
        return temp;
    }

    //单链表的反转
    public static void revSingleLinked(HeroNode heron) {
        if (heron.getNext()==null||heron.getNext().getNext()==null)
        {
            return;
        }
        HeroNode cur=heron.getNext();
        HeroNode next=null;//指向当前节点cur的下一个节点
        HeroNode reverseHead=new HeroNode(0,"","");
        //遍历原来的链表，每遍历一个节点，就将其去除，并放在新的链表的最前端
        while (cur!=null)
        {
            next =cur.getNext();//先展示保存当前节点的下一个节点
            cur.setNext(reverseHead.getNext());
            reverseHead.setNext(cur);//将cur连接到新的链表上
            cur=next;
        }
        heron.setNext(reverseHead.getNext());
    }
}

class SingleLinked {
    private HeroNode head = new HeroNode(0, "", "");//头节点

    public HeroNode getHead() {
        return head;
    }

    //添加英雄
    public void add(HeroNode hero) {
        HeroNode temp = head;
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(hero);
    }

    //插入英雄按照顺序
    public void addOrder(HeroNode hero) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.getNext() == null) {
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
            temp.setNext(hero);
        }
    }

    public void delete(HeroNode hero) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.getNext() == null) {
                System.out.println("链表为空");
                break;
            } else if (temp.getNext().getNo() == hero.getNo()) {
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag) {
            temp.setNext(temp.getNext().getNext());
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
        HeroNode temp = head.getNext();
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
class HeroNode {
    private int no;
    private String name;
    private String nickName;
    private HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setNext(HeroNode next) {
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

    public HeroNode getNext() {
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
