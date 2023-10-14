using Supermarket.Model;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Supermarket.Business{
    internal class ProductsDAO{
        private readonly Dictionary<int, Products> ProductList;
        private static int ProductSec;
        public ProductsDAO() { 
            ProductList = new Dictionary<int, Products>();
            ProductSec = 0;
        }
        public bool AddProduct(Products product) {
            try {
                product.Id = ++ProductSec;
                ProductList.Add((int)product.Id, product);
            }catch (ArgumentException){
                return false;
            }
            return true;
        }
        public bool RemoveProduct(int id){
            bool idExists = ProductList.ContainsKey(id);
            if (idExists){
                ProductList.Remove(id);
                return true;
            }
            return false;
        }
        public Products GetProduct(int id) {
            bool idExists = ProductList.ContainsKey(id);
            if (idExists){
                Products product = ProductList[id];
                return product;
            }
            return null;
        }
        public bool UpdateProduct(int id, Products product) {
            bool idExists = ProductList.ContainsKey(id);
            if (idExists){
                try{
                    ProductList[id] = product;
                    return true;
                }
                catch (Exception){
                    return false;
                }
            }
            return false;
        }
        public Dictionary<int, Products> GetProductList() { 
            return ProductList;
        }
    }
}
