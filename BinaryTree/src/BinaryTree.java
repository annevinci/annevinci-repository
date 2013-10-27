
public class BinaryTree {
	
	Node root; //корень дерева
	
	private void add_private(int value, Node node) //добавляем узел
	{
		if(root==null) //если корня нет
		{
			root=new Node(value); //создаём корень
			System.out.println("Корень - "+root.value);
			return;
		}
		if (node.value>value) //если значение родителя больше, чем значение потомка
		{
			if(node.left==null) //если левого потомка нет
			{
				node.left=new Node(value); //создаём левого потомка
				System.out.println("Левый потомок - "+value+" для корня - "+node.value);
			}
			else //если левый потомок есть
			{
				add_private(value,node.left); //вызывает эту же функцию, но корень-левый потомок
			}
		}
		else
		{
			if(node.right==null) //если правого потомка нет
			{
				node.right=new Node(value); //создаём правого потомка
				System.out.println("Правый потомок - "+value+" для корня - "+node.value);
			}
			else //если левый потомок есть
			{
				add_private(value,node.right); //вызывает эту же функцию, но корень-правый потомок
			}
		}
	}
	
	public void add (int value) //добавляем узел
	{
		add_private(value,root);
	}

}
