using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Supermarket.Model{
    internal class Products{
        public int? Id { get; set; }
        public string Name { get; set; }
        public int Price { get; set; }
        public int Stock { get; set; }
        public int CategoryId { get; set; }
        public Products(int? id, string name, int price, int stock, int categoryid) { 
            Id = id;
            Name = name;
            Price = price;
            Stock = stock;
            CategoryId = categoryid;
        }

    }
}
