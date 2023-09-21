# Warehouse Doku

# Code

Wenn die Website aufgrufen wird kommt man auf die Main page wo man zu den Verschiedenen Subpages weitergeleitet werden kann. Jenachdem ob die data oder xml Seite aufgerufen wird, wird der Output als JSON oder XML angezeigt.

![Untitled](https://i.imgur.com/qFt1zfS.png)

Es gibt eine Liste mit Standorten und es wird ein zufälliger Standort ausgewählt. Dann werden von der WarehouseDATA die verschiedenen Attribute gesetzt.

![Untitled](https://imgur.com/aQxrXIj.png)

Die WarehouseData hat eine zufälige Anzahl zwichen 4 und 10 Produkten, welche in einer ArrayList gespeichert werden. Es wird auch der Aktuelle Timestamp hinzugefügt.

![Untitled](https://imgur.com/erFaEIc.png)

Ein Produkt wird erstellt indem eine Zufällige ID erstellt wird und ein Zufälliger Array aus dem Array der möglichen Produkt Daten ausgewählt wird. 

![Untitled](https://imgur.com/3OcDDLa.png)

# Probleme

- Anzeige bei XML war:
    
    ```xml
    ...
    <productData>
    	<product>
    		<product>
    			<id>..<id/>
    			....
    		</product>
    	</product>
    </productData>
    ```
    
- Lösung:
    - Keine ProductData Klasse verwenden sondern einen Array an Products in der WarehouseData Klasse verwenden
