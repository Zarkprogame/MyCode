using Supermarker.Business;
using Supermarket.View;

namespace Supermarket
{
    public partial class Mainform : Form
    {

        internal PayModeDAO payModeDAO;
        public Mainform()
        {
            payModeDAO = new PayModeDAO();
            InitializeComponent();
            payModeDAO.AddPayMode(new Model.PayMode(null, "Cash"));
        }

        private void ExitMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void AboutMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Supermarkert V 0.1", "About us");
        }

        private void PayModeMenuItem_Click(object sender, EventArgs e)
        {
            PayModeForm formPayMode = new PayModeForm(ref payModeDAO);
            formPayMode.MdiParent = this;
            formPayMode.Show();
        }

        //private void ProductsMenuItem_Click(object sender, EventArgs e)
        //{
        //    ProductsForm formProduct = new ProductsForm(ref ProductDAO);
        //}
    }
}