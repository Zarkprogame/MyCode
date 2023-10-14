using System.Dynamic;
using Triangulo_GUI.Models;

namespace Triangulo_GUI
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btnNuevo_Click(object sender, EventArgs e)
        {
            Triangulo triangulo = new Triangulo();
            Triangulo.@base = int.Parse(txtBase.Text);
            Triangulo.altura = int.Parse(txtAltura.Text);
            triangulo.calcuraArea();
            txtArea.Text = Triangulo.area.ToString();
        }

        private void btnCerrar_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }
    }
}