
public class BinaryTree {
	
	Node root; //������ ������
	
	private void add_private(int value, Node node) //��������� ����
	{
		if(root==null) //���� ����� ���
		{
			root=new Node(value); //������ ������
			System.out.println("������ - "+root.value);
			return;
		}
		if (node.value>value) //���� �������� �������� ������, ��� �������� �������
		{
			if(node.left==null) //���� ������ ������� ���
			{
				node.left=new Node(value); //������ ������ �������
				System.out.println("����� ������� - "+value+" ��� ����� - "+node.value);
			}
			else //���� ����� ������� ����
			{
				add_private(value,node.left); //�������� ��� �� �������, �� ������-����� �������
			}
		}
		else
		{
			if(node.right==null) //���� ������� ������� ���
			{
				node.right=new Node(value); //������ ������� �������
				System.out.println("������ ������� - "+value+" ��� ����� - "+node.value);
			}
			else //���� ����� ������� ����
			{
				add_private(value,node.right); //�������� ��� �� �������, �� ������-������ �������
			}
		}
	}
	
	public void add (int value) //��������� ����
	{
		add_private(value,root);
	}

}
