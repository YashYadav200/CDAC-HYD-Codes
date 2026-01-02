#include <iostream>
using namespace std;

// ---------- Base Class ----------
class Item {
protected:
    string name;
    int id;
    float price;
    int quantity;

public:
    Item(string n, int ID, float p, int q) {
        name = n;
        id = ID;
        price = p;
        quantity = q;
    }

    void display() {
        cout << "Name: " << name << ", ID: " << id
             << ", Price: " << price << ", Qty: " << quantity << endl;
    }

    float getTotalValue() {
        return price * quantity;
    }

    ~Item() {
        cout << "Item " << name << " destroyed.\n";
    }
};

// ---------- Derived Class 1 ----------
class Electronics : public Item {
    int warranty;
    float power;

public:
    Electronics(string n, int ID, float p, int q, int w, float pw)
        : Item(n, ID, p, q) {
        warranty = w;
        power = pw;
    }

    void show() {
        cout << "\n[Electronics]\n";
        display();
        cout << "Warranty: " << warranty << " yrs, Power: " << power << "W\n";
    }

    ~Electronics() { cout << "Electronics cleaned.\n"; }
};

// ---------- Derived Class 2 ----------
class Grocery : public Item {
    string expiry;
    float weight;

public:
    Grocery(string n, int ID, float p, int q, string e, float w)
        : Item(n, ID, p, q) {
        expiry = e;
        weight = w;
    }

    void show() {
        cout << "\n[Grocery]\n";
        display();
        cout << "Expiry: " << expiry << ", Weight: " << weight << "kg\n";
    }

    ~Grocery() { cout << "Grocery cleaned.\n"; }
};

// ---------- Main Function ----------
int main() {
    int n;
    cout << "Enter total items: ";
    cin >> n;

    Item* inv[n]; // array of base class pointers
    float total = 0;

    for (int i = 0; i < n; i++) {
        int type;
        cout << "\nEnter type (1=Electronics, 2=Grocery): ";
        cin >> type;

        string name;
        int id, qty;
        float price;

        cout << "Name: ";
        cin >> name;
        cout << "ID: ";
        cin >> id;
        cout << "Price: ";
        cin >> price;
        cout << "Quantity: ";
        cin >> qty;

        if (type == 1) {
            int w; float pw;
            cout << "Warranty: ";
            cin >> w;
            cout << "Power: ";
            cin >> pw;
            inv[i] = new Electronics(name, id, price, qty, w, pw);
        } 
        else {
            string exp; float wt;
            cout << "Expiry: ";
            cin >> exp;
            cout << "Weight: ";
            cin >> wt;
            inv[i] = new Grocery(name, id, price, qty, exp, wt);
        }
    }

    cout << "\n--- INVENTORY DETAILS ---\n";
    for (int i = 0; i < n; i++) {
        if (Electronics* e = (Electronics*)inv[i]) e->display();
        total += inv[i]->getTotalValue();
    }

    cout << "\nTotal Value: " << total << endl;

    for (int i = 0; i < n; i++) delete inv[i];

    return 0;
}
