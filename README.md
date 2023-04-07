# Odev.2.1


Java İkili Ağaç Dengesi Kontrolü Bu Java kodu, verilen bir ikili ağacın dengeli olup olmadığını kontrol etmek için kullanılır. TreeNode sınıfı, ağacın her düğümünü temsil etmek için kullanılır ve BinaryTree sınıfı, ağacın dengeli olup olmadığını belirlemek için bir isBalanced fonksiyonu sağlar.

Kullanım Bu Java kodunu çalıştırmak için Java JDK'nın yüklü olduğundan ve javac ve java komutlarının çalıştırılabildiğinden emin olun. Ayrıca, bu kodun derlenmesi ve çalıştırılması için bir Java IDE'si de kullanabilirsiniz.

Kodu indirdikten sonra, konsolda aşağıdaki komutu kullanarak kodu derleyin: javac BinaryTree.java

Daha sonra, aşağıdaki komutla kodu çalıştırın: java BinaryTreeKod

örnek bir ikili ağaç oluşturur ve isBalanced fonksiyonunu kullanarak ağacın dengeli olup olmadığını belirler. Sonuç konsola yazdırılır.


Algoritmanın Kullanım Amacı Ve Calısma Sekli

Bu algoritma, bir ikili ağacın dengeli olup olmadığını kontrol etmek için kullanılır. İkili ağaçlarda, her düğüm en fazla iki çocuk düğüme sahip olabilir. Bir ağaç, her seviyede yaklaşık olarak aynı sayıda düğüm içeriyorsa, "dengeli" olarak kabul edilir.
Algoritma, her bir düğümün sol ve sağ alt ağaçlarındaki yükseklikleri hesaplar ve bu yükseklikler arasındaki farkı kontrol eder. Eğer fark 1'den büyükse, ağaç dengesizdir ve false değeri döndürülür. Aksi takdirde, alt ağaçlarda bu işlem tekrarlanır ve sonunda ağacın tamamının dengeli olup olmadığı belirlenir. Algoritmanın zaman karmaşıklığı O(n log n)'dir, n ağacın düğüm sayısıdır.
Bu algoritma, özellikle ağaç veri yapılarının kullanıldığı algoritmalar için önemlidir. Bir ağacın dengeli olup olmadığını belirlemek, ağacın performansını ve verimliliğini etkileyebilir. Örneğin, bir arama ağacı dengesiz ise, arama işlemi O(n) yerine O(n log n) zaman alabilir. Bu nedenle, algoritmaların tasarımında ve uygulanmasında dengeli ağaçlar kullanımı önemlidir.
