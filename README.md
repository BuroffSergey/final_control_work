# final_control_work

1 Использование команды cat в Linux
 Создать два текстовых файла: "Pets"(Домашние животные) и "Pack
animals"(вьючные животные), используя команду `cat` в терминале Linux. В
первом файле перечислить собак, кошек и хомяков. Во втором — лошадей,
верблюдов и ослов.


```sh
cat > Pets 'enter'
собаки
кошки
хомяки 'Cntr +D'
```


```sh
cat > Pack_animals 'enter'
лошади 
верблюды 
ослы 'Cntr +D'
```


- Объединить содержимое этих двух файлов в один и просмотреть его
содержимое.

```sh
cat Pets Pack_animals > Human_friends 'enter'

```

- Переименовать получившийся файл в "Human Friends"

```sh
mv Human_friends HumanFriends 'enter'

```


2 Работа с директориями в Linux
- Создать новую директорию и переместить туда файл "Human Friends".

```sh
mv HumanFriends my_new_direktory 'enter'
```


3 Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную
машину ”

```sh
sudo apt install mysql-server 'enter'
'y'
```
- Подключить дополнительный репозиторий MySQL и установить один из
пакетов из этого репозитория.

По URL запросу https://dev.mysql.com/downloads/repo/apt/ находим репозиторий  "Репозиторий MySQL APT", копируем адрес расположения и добавляем к основному URL. Для скачивания используем команду sudo wget.


```sh
sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.33-1_all.deb 'enter'

```
устанавливаем

```sh
sudo dpkg -i mysql-apt-config_0.8.33-1_all.deb 'enter'

```
дополнительный пакет библиотек

```sh
sudo apt-get install libmysqlclient21 'enter'

```


4 Управление deb-пакетами
- Установить и затем удалить deb-пакет, используя команду `dpkg`.


```sh
sudo dpkg -i mysql-apt-config_0.8.33-1_all.deb 'enter'

```

```sh
sudo dpkg -r mysql-apt-config 'enter'

```



