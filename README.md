# Petcu_Robert_Adrian_ActivitateCTS2025
ActivitateCTS2025


# Design pattern - Creationale 

# 1. SINGLETON
Permite crearea unei singure instante a unei clase si ofera un punct global de acces la ea.

- instanta statica 
- constructor privat
- metoda statica getInstance()

# 2. SIMPLE FACTORY
Creeaza obiecte dintr-o familie de clase in functie de un parametru.

- Clasa abstracta/interfata
- Mai multe clase care extind clasa abstracta/implementeaza interfata
- Un enum cu tipurile claselor care trebuie create
- O clasa fabrica care are o functie creazaClase(Enum tip) care primeste ca parametru enum si returneaza instanta potrivita 

# 3. FACTORY METHOD

Similar cu Simple Factory, dar foloseste o ierarhie de fabrici.
Abstractizeaza procesorul de creare, dand responsabilitatea fiecarei fabrici concrete.

- Clasa abstracta/interfata
- Mai multe clase care extind clasa abstracta/implementeaza interfata
- O interfata Tip
- Mai multe Enum tip care implementeaza interfata Tip
- O interfata cu metoda creazaClase(Enum tip) care primeste ca parametru un enum si returneaza instanta portivita
- Clase concrete care decid ce obiecte sa creeze si implementeaza interfata
# 4. PROTOTYPE

Folosit pentru a clona rapid obiectele costisitoare de creat(care au constructori greoi sau multe resurse implicate)

- Clasa abstracta cu atribute protected si constructorul greoi de creat cu validari etc si METODA ABSTRACTA CLONEAZA
- Clasa concreta care extinde clasa abstracta, defineste metoda cloneaza sa face DEEP copy si suprascrie contructorii

# 5. BUILDER

Construieste obiecte complexe cu multi parametri optionali in mod flexibil si clar.Obiectul final e imutabil.

- Clasa concreta cu constructor protected si setteri protected
- Interfata care are metoda ClasaConcreta build()
- Clasa builder care are aceleasi atribute ca cea concreta , constructor public care seteaza valori si setteri care seteaza si returneaza obiectul de tip builder modificat si metoda BUILD care returneaza obiectul final

