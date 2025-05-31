# Реалізація всіх пунктів завдання

## ✅ ВАРІАНТ 5: **Сервіс доставки їжі**

- розробити REST-контролери для заданих запитів

![image](https://github.com/user-attachments/assets/203720e1-927f-4760-8a7e-3c8ce95c48c0)

 
- розробити відповідні сервіси, які оброблюють запити REST-контролерів
  
![image](https://github.com/user-attachments/assets/6c51f592-5eaa-40d0-8466-f3c965dca6bf)

- розробити класи сутностей та вказати реляційні відношення між ними
  
![image](https://github.com/user-attachments/assets/48914c75-ce3d-45b6-a4b2-0898e97c20f9)


- підключити реляційну СУБД та розробити інтерфейси репозиторіїв
  
![image](https://github.com/user-attachments/assets/a6b809da-7f6f-48c1-8bfa-3c3e72d4d4fd)
![image](https://github.com/user-attachments/assets/6df3f85c-f50f-429b-84ef-a127d46d3df6)
![image](https://github.com/user-attachments/assets/4a255afd-8441-4f93-a47a-0be745294192)

- додати сутність User для Spring Security
  
  ![image](https://github.com/user-attachments/assets/e1e72a58-b352-4029-a6b4-0fd0a25f17da)

- додати функціонал реєстрації користувача за допомогою логіну та паролю (HTML-форма та REST-запит)
https://github.com/nikitakara134/front.git
https://front-u89i.onrender.com
![image](https://github.com/user-attachments/assets/bef88db7-da0a-46d3-ac18-0a7d2f67a023)
![image](https://github.com/user-attachments/assets/a990640f-dffb-4758-a4ca-39804e962379)

  
- додати підтримку сесій та jwt-токенів

![image](https://github.com/user-attachments/assets/6fe90054-5188-4395-872e-dac3e3c051b6)
![image](https://github.com/user-attachments/assets/1aa1d86c-65a5-4290-8956-336fdbf8cecf)


  
- додати автентифікацію за допомогою логіну та паролю (HTML-форма та REST-запит за допомогою jwt-токену)

![image](https://github.com/user-attachments/assets/1aa1d86c-65a5-4290-8956-336fdbf8cecf)
![image](https://github.com/user-attachments/assets/b763a238-073f-409d-a983-ad377e632a8e)
  
- додати зберігання логів за допомогою ELK-стеку
  
![image](https://github.com/user-attachments/assets/32bed4f6-5f45-46b0-9057-ba52d576fc60)

  
- опціонально - додати автентифікацію за допомогою OAuth2
  
![image](https://github.com/user-attachments/assets/a24934b0-9c10-437a-b502-bd5981de32e1)

  
- опціонально - додати тестування розробленого коду
  
![image](https://github.com/user-attachments/assets/ae25f9b0-dfff-4b1d-b8a9-eb430c3a9594)

  
- створити GitHub-репизиторій з проєктом
  
https://github.com/nikitakara134/delivery.git

  
- розгорнути проєкт на хмарному сервісі (наприклад, Render)
  
https://delivery-xhqv.onrender.com

![image](https://github.com/user-attachments/assets/c982404b-8aa2-407b-af67-d7806f63cc45)


- запити

 **RestaurantController**  
- `GET /restaurants` — всі ресторани  
- `POST /restaurants` — додати ресторан  
- `GET /restaurants/{id}` — ресторан за ID
  
![image](https://github.com/user-attachments/assets/b288a761-b39f-4216-a846-d2a5ae76993f)
![image](https://github.com/user-attachments/assets/872c2489-f7b2-4a8c-a94d-0bc8c9a03920)
![image](https://github.com/user-attachments/assets/b290c160-8d66-4fea-9d7c-cc60fda613d3)

**MenuItemController**  
- `GET /menu/{restaurantId}` — меню ресторану  
- `POST /menu` — додати позицію в меню
  
![image](https://github.com/user-attachments/assets/f2c0a96a-6718-4c59-a617-758616dc8a87)
![image](https://github.com/user-attachments/assets/1234daf9-09d8-4c77-8900-6d0f77ce294c)

**DeliveryOrderController**  
- `POST /orders` — оформити замовлення  
- `GET /orders/by-customer` — перегляд замовлень по імені 

![image](https://github.com/user-attachments/assets/d21d495e-a6f2-462b-89cf-90bbeb9cdc9f)
![image](https://github.com/user-attachments/assets/d5ea3c8f-297f-41f8-a913-197272e0a1d2)
