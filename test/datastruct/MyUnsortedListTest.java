package datastruct;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnsortedListTest {

	@Test
	public void testCreation() {
		UnsortedList<Integer> list = MyUnsortedList.of(21, 22, 23);
        assertEquals( "creation de liste non vide doit être 21 22 23","21 22 23", list.toString());
	}
	
	@Test
	public void testIsEmpty() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		assertTrue("isEmpty liste vide", list.isEmpty());
	}
	
	@Test
	public void testIsEmptyFalse() {
		UnsortedList<Integer> list = MyUnsortedList.of(21);
		assertFalse("isEmpty liste non vide", list.isEmpty());
	}
	
	@Test
	public void testIsEmptyPop() {
		UnsortedList<Integer> list = MyUnsortedList.of(21);
		list.pop();
		assertTrue("isEmpty list vide après pop", list.isEmpty());
	}
	
	@Test
	public void testIsEmptyPopLast() {
		UnsortedList<Integer> list = MyUnsortedList.of(21);
		list.popLast();
		assertTrue("isEmpty list vide après popLast", list.isEmpty());
	}
	
	@Test
	public void testIsEmptyRemove() {
		UnsortedList<Integer> list = MyUnsortedList.of(21);
		list.remove(0);
		assertTrue("isEmpty liste vide après remove",list.isEmpty());
	}
	
	@Test
	public void testIsEmptyAppend() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.append(21);
		assertFalse("isEmpty list non vide après append", list.isEmpty());
	}
	
	@Test
	public void testIsEmptyPrepend() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.prepend(21);
		assertFalse("isEmpty list non vide après prepend", list.isEmpty());
	}
	
	@Test
	public void testSizeVide() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		assertEquals("size liste vide", 0, list.size());
	}
	
	@Test
	public void testSizeNonVide() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		assertEquals("size liste non vide", 3, list.size());
	}
	
	@Test
	public void testSizeAppendVide() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.append(21);
		assertEquals("size liste vide append", 1, list.size());
	}
	
	@Test
	public void testSizeAppendNonVide() {
		UnsortedList<Integer> list = MyUnsortedList.of(21);
		list.append(22);
		assertEquals("size liste non vide append",2, list.size());
	}
	
	@Test
	public void testSizePrependVide() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.prepend(21);
		assertEquals("size liste vide prepend", 1, list.size());
	}
	
	@Test
	public void testSizePrependNonVide() {
		UnsortedList<Integer> list = MyUnsortedList.of(21);
		list.prepend(22);
		assertEquals("size liste non vide prepend",2, list.size());
	}
	
	@Test
	public void testSizeRemoveDebut() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		list.remove(0);
		assertEquals("taille liste remove débur", 2, list.size());
	}
	
	@Test
	public void testSizeRemoveMilieu() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		list.remove(1);
		assertEquals("taille liste remove milieu", 2, list.size());
	}
	
	@Test
	public void testSizeRemoveFin() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		list.remove(2);
		assertEquals("taille liste remove milieu", 2, list.size());
	}
	
	@Test
	public void testAppendVide() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.append(98);
		assertEquals("nouvelle valeur de la tête append vide", 98, (int)list.getHead());
	}
	
	@Test
	public void testAppendNonVide() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		list.append(98);
		assertEquals("dernière valeur non vide", "21 22 23 98", list.toString());
	}

	@Test
	public void testPrependVide() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.prepend(98);
		assertEquals("nouvelle valeur de la tête prepend vide", 98, (int)list.getHead());
	}
	
	@Test
	public void testPrependNonVide() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		list.prepend(98);
		assertEquals("nouvelle valeur de la tête prepend non vide", 98, (int)list.getHead());
	}

	@Test
	public void testPopNonVideRecupere() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		int oldHead = list.pop();
		assertEquals("pop récupère la tête", 21, oldHead);
	}
	
	@Test
	public void testPopNonVideModifie() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		list.pop();
		assertEquals("pop modifie la tête", 22, (int)list.getHead());
	}
	
	@Test
	public void testPopSingleElementRecupere() {
	    UnsortedList<Integer> list = MyUnsortedList.of(22);
	    int popped = list.pop();
	    assertEquals("pop doit récupérer le seul élément", 22, popped);
	}
	
	@Test
	public void testPopSingleElementModifie() {
	    UnsortedList<Integer> list = MyUnsortedList.of(22);
	    list.pop();
	    assertEquals("list doit être vide après pop", "",list.toString());
	}

	@Test
	public void testPopLastNonVideRecupere() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		int oldEnd = list.popLast();
		assertEquals("pop récupère la tête", 23, oldEnd);
	}
	
	@Test
	public void testPopLastNonVideModifie() {
		UnsortedList<Integer> list = MyUnsortedList.of(21,22,23);
		list.popLast();
		assertEquals("pop supprime le dernier élément", "21 22", list.toString());
	}
	
	@Test
	public void testPopLastSingleElementRecupere() {
	    UnsortedList<Integer> list = MyUnsortedList.of(22);
	    int popped = list.popLast();
	    assertEquals("pop doit récupérer le seul élément", 22, popped);
	}
	
	@Test
	public void testPopLastSingleElementModifie() {
	    UnsortedList<Integer> list = MyUnsortedList.of(22);
	    list.popLast();
	    assertEquals("list doit être vide après popLast", "",list.toString());
	}
	
	@Test
    public void testRemoveDebutRecupere() {
        UnsortedList<Integer> list = MyUnsortedList.of(21, 22, 23);
        int removed = list.remove(0);
        assertEquals("remove début élément supprimé",21, removed);
    }


	@Test
    public void testRemoveDebutModifie() {
        UnsortedList<Integer> list = MyUnsortedList.of(21, 22, 23);
        list.remove(0);
        assertEquals("remove début liste restante","22 23", list.toString());
    }

    @Test
    public void testRemoveMilieuRecupere() {
        UnsortedList<Integer> list = MyUnsortedList.of(21, 22, 23);
        int removed = list.remove(1);
        assertEquals("remove milieu élément supprimé",22, removed);
    }
    
    @Test
    public void testRemoveMilieuModifie() {
        UnsortedList<Integer> list = MyUnsortedList.of(21, 22, 23);
        list.remove(1);
        assertEquals("remove milieu liste restante","21 23", list.toString());
    }

    @Test
    public void testRemoveFinRecupere() {
        UnsortedList<Integer> list = MyUnsortedList.of(21, 22, 23);
        int removed = list.remove(2);
        assertEquals("remove fin élément supprimé", 23, removed);
    }
    
    @Test
    public void testRemoveFinModifie() {
        UnsortedList<Integer> list = MyUnsortedList.of(21, 22, 23);
        list.remove(2);
        assertEquals("remove fin liste restante","21 22", list.toString());
    }

    @Test
    public void testInsertDebut() {
        UnsortedList<Integer> list = MyUnsortedList.of(22, 23);
        list.insert(98, 0);
        assertEquals( "list avec insertion au début","98 22 23", list.toString());
    }
	
	@Test
	public void testInsertMilieu() {
		UnsortedList<Integer> list = MyUnsortedList.of(22, 23);
        list.insert(98, 1);
        assertEquals( "list avec insertion au milieu","22 98 23", list.toString());
	}
	
	@Test
	public void testInsertFin() {
		UnsortedList<Integer> list = MyUnsortedList.of(22, 23);
        list.insert(98, 2);
        assertEquals( "list avec insertion à la fin","22 23 98", list.toString());
	}
	
	@Test
	public void testInsertSize() {
		UnsortedList<Integer> list = MyUnsortedList.of(22, 23);
        list.insert(98, list.size());
        assertEquals( "list avec insertion à la fin","22 23 98", list.toString());
	}
	
	@Test
	public void testInsertVide0() {
		UnsortedList<Integer> list = MyUnsortedList.of();
        list.insert(98, 0);
        assertEquals( "list vide insertion 0","98", list.toString());
	}
	
	@Test
	public void testInsertVideTaille() {
		UnsortedList<Integer> list = MyUnsortedList.of();
        list.insert(98, list.size());
        assertEquals( "list vide insertion size","98", list.toString());
	}
	
	@Test
	public void testEqualsTrueVide() {
		UnsortedList<Integer> list1 = MyUnsortedList.of();
		UnsortedList<Integer> list2 = MyUnsortedList.of();
		assertTrue("une liste vide est équivalente à une autre liste vide",list1.equals(list2));
	}
	
	@Test
	public void testEqualsTrueNonVide() {
		UnsortedList<Integer> list1 = MyUnsortedList.of(98,99,100);
		UnsortedList<Integer> list2 = MyUnsortedList.of(98,99,100);
		assertTrue("une liste vide est équivalente à une autre liste vide",list1.equals(list2));
	}
	
	@Test
	public void testEqualsFalseNonVide() {
		UnsortedList<Integer> list1 = MyUnsortedList.of(21,22);
		UnsortedList<Integer> list2 = MyUnsortedList.of(98,99,100);
		assertFalse("des listes n'ayant pas les même éléments ne sont pas équivalentes",list1.equals(list2));
	}
	
	@Test
	public void testEqualsFalseVideNonVide() {
		UnsortedList<Integer> list1 = MyUnsortedList.of();
		UnsortedList<Integer> list2 = MyUnsortedList.of(98,99,100);
		assertFalse("des listes n'ayant pas les même éléments ne sont pas équivalentes",list1.equals(list2));
	}
	
	@Test
	public void testEqualsTrueNonVideUnElement() {
		UnsortedList<Integer> list1 = MyUnsortedList.of(98);
		UnsortedList<Integer> list2 = MyUnsortedList.of(98);
		assertTrue("des listes ayant le même unique élément sont équivalentes",list1.equals(list2));
	}
	
	@Test
	public void testEqualsFalseNonVideUnElement() {
		UnsortedList<Integer> list1 = MyUnsortedList.of();
		UnsortedList<Integer> list2 = MyUnsortedList.of(98);
		assertFalse("des listes n'ayant pas le même unique élément ne sont pas équivalentes",list1.equals(list2));
	}
	
	
	@Test
	public void testEqualsFalseNonUnsortedList() {
		UnsortedList<Integer> list1 = MyUnsortedList.of();
		assertFalse("une UnsortedList n'est pas équivalente à un autre objet",list1.equals(4));
	}
	
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testInsertOutOfBoundsVide() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of();
        list.insert(98, 1);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testInsertNegVide() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of();
        list.insert(98, -1);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testInsertOutOfBoundsNonVide() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of(22, 23);
        list.insert(98, 6);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testInsertNegNonVide() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of(22, 23);
        list.insert(98, -6);
	}
	
	@Test(expected = EmptyListException.class)
	public void testPopVide() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of();
        list.pop();
	}
	
	@Test(expected = EmptyListException.class)
	public void testPopLastVide() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of();
        list.popLast();
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveVide() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.remove(3);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveVide2() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.remove(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveInvalide() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of(22, 23);
		list.remove(6);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveSize() throws Exception{
		UnsortedList<Integer> list = MyUnsortedList.of(22, 23);
		list.remove(list.size());
	}
	
}
