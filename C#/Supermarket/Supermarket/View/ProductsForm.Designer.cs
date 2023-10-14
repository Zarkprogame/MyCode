namespace Supermarket.View
{
    partial class ProductsForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            DgProduct = new DataGridView();
            groupBox1 = new GroupBox();
            btnClose = new Button();
            btnDelete = new Button();
            btnEdit = new Button();
            btnNew = new Button();
            Data = new GroupBox();
            lblStock = new Label();
            txtStock = new TextBox();
            txtPrice = new TextBox();
            lblPrice = new Label();
            txtName = new TextBox();
            txtId = new TextBox();
            lblName = new Label();
            lblId = new Label();
            lblCategoryId = new Label();
            textBox1 = new TextBox();
            IdPayMode = new DataGridViewTextBoxColumn();
            NamePayMode = new DataGridViewTextBoxColumn();
            Price = new DataGridViewTextBoxColumn();
            Stock = new DataGridViewTextBoxColumn();
            CategoryId = new DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)DgProduct).BeginInit();
            groupBox1.SuspendLayout();
            Data.SuspendLayout();
            SuspendLayout();
            // 
            // DgProduct
            // 
            DgProduct.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            DgProduct.Columns.AddRange(new DataGridViewColumn[] { IdPayMode, NamePayMode, Price, Stock, CategoryId });
            DgProduct.Location = new Point(51, 305);
            DgProduct.Name = "DgProduct";
            DgProduct.RowHeadersWidth = 51;
            DgProduct.RowTemplate.Height = 29;
            DgProduct.Size = new Size(810, 218);
            DgProduct.TabIndex = 5;
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(btnClose);
            groupBox1.Controls.Add(btnDelete);
            groupBox1.Controls.Add(btnEdit);
            groupBox1.Controls.Add(btnNew);
            groupBox1.Location = new Point(500, 34);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(361, 252);
            groupBox1.TabIndex = 4;
            groupBox1.TabStop = false;
            groupBox1.Text = "Commands";
            // 
            // btnClose
            // 
            btnClose.Image = Properties.Resources.cerrar;
            btnClose.ImageAlign = ContentAlignment.TopCenter;
            btnClose.Location = new Point(188, 151);
            btnClose.Name = "btnClose";
            btnClose.Size = new Size(114, 68);
            btnClose.TabIndex = 3;
            btnClose.Text = "&Close";
            btnClose.TextImageRelation = TextImageRelation.ImageAboveText;
            btnClose.UseVisualStyleBackColor = true;
            // 
            // btnDelete
            // 
            btnDelete.Image = Properties.Resources.delete;
            btnDelete.ImageAlign = ContentAlignment.TopCenter;
            btnDelete.Location = new Point(56, 151);
            btnDelete.Name = "btnDelete";
            btnDelete.Size = new Size(114, 68);
            btnDelete.TabIndex = 2;
            btnDelete.Text = "&Delete";
            btnDelete.TextImageRelation = TextImageRelation.ImageAboveText;
            btnDelete.UseVisualStyleBackColor = true;
            // 
            // btnEdit
            // 
            btnEdit.Image = Properties.Resources.edit;
            btnEdit.ImageAlign = ContentAlignment.TopCenter;
            btnEdit.Location = new Point(188, 42);
            btnEdit.Name = "btnEdit";
            btnEdit.Size = new Size(114, 68);
            btnEdit.TabIndex = 1;
            btnEdit.Text = "&Edit";
            btnEdit.TextImageRelation = TextImageRelation.ImageAboveText;
            btnEdit.UseVisualStyleBackColor = true;
            // 
            // btnNew
            // 
            btnNew.Image = Properties.Resources._new;
            btnNew.ImageAlign = ContentAlignment.TopCenter;
            btnNew.Location = new Point(56, 42);
            btnNew.Name = "btnNew";
            btnNew.Size = new Size(114, 68);
            btnNew.TabIndex = 0;
            btnNew.Text = "&New";
            btnNew.TextImageRelation = TextImageRelation.ImageAboveText;
            btnNew.UseVisualStyleBackColor = true;
            btnNew.Click += btnNew_Click;
            // 
            // Data
            // 
            Data.Controls.Add(textBox1);
            Data.Controls.Add(lblCategoryId);
            Data.Controls.Add(lblStock);
            Data.Controls.Add(txtStock);
            Data.Controls.Add(txtPrice);
            Data.Controls.Add(lblPrice);
            Data.Controls.Add(txtName);
            Data.Controls.Add(txtId);
            Data.Controls.Add(lblName);
            Data.Controls.Add(lblId);
            Data.Location = new Point(51, 34);
            Data.Name = "Data";
            Data.Size = new Size(391, 252);
            Data.TabIndex = 3;
            Data.TabStop = false;
            Data.Text = "Data";
            // 
            // lblStock
            // 
            lblStock.AutoSize = true;
            lblStock.Location = new Point(25, 209);
            lblStock.Name = "lblStock";
            lblStock.Size = new Size(45, 20);
            lblStock.TabIndex = 7;
            lblStock.Text = "Stock";
            // 
            // txtStock
            // 
            txtStock.Enabled = false;
            txtStock.Location = new Point(107, 206);
            txtStock.Name = "txtStock";
            txtStock.Size = new Size(199, 27);
            txtStock.TabIndex = 6;
            txtStock.TextAlign = HorizontalAlignment.Right;
            // 
            // txtPrice
            // 
            txtPrice.Enabled = false;
            txtPrice.Location = new Point(107, 162);
            txtPrice.Name = "txtPrice";
            txtPrice.Size = new Size(199, 27);
            txtPrice.TabIndex = 5;
            txtPrice.TextAlign = HorizontalAlignment.Right;
            // 
            // lblPrice
            // 
            lblPrice.AutoSize = true;
            lblPrice.Location = new Point(25, 165);
            lblPrice.Name = "lblPrice";
            lblPrice.Size = new Size(41, 20);
            lblPrice.TabIndex = 4;
            lblPrice.Text = "Price";
            // 
            // txtName
            // 
            txtName.Enabled = false;
            txtName.Location = new Point(107, 122);
            txtName.Name = "txtName";
            txtName.Size = new Size(199, 27);
            txtName.TabIndex = 3;
            txtName.TextAlign = HorizontalAlignment.Right;
            // 
            // txtId
            // 
            txtId.Enabled = false;
            txtId.Location = new Point(107, 39);
            txtId.Name = "txtId";
            txtId.Size = new Size(199, 27);
            txtId.TabIndex = 2;
            txtId.TextAlign = HorizontalAlignment.Right;
            // 
            // lblName
            // 
            lblName.AutoSize = true;
            lblName.Location = new Point(25, 125);
            lblName.Name = "lblName";
            lblName.Size = new Size(49, 20);
            lblName.TabIndex = 1;
            lblName.Text = "Name";
            // 
            // lblId
            // 
            lblId.AutoSize = true;
            lblId.Location = new Point(25, 42);
            lblId.Name = "lblId";
            lblId.Size = new Size(22, 20);
            lblId.TabIndex = 0;
            lblId.Text = "Id";
            // 
            // lblCategoryId
            // 
            lblCategoryId.AutoSize = true;
            lblCategoryId.Location = new Point(6, 81);
            lblCategoryId.Name = "lblCategoryId";
            lblCategoryId.Size = new Size(69, 20);
            lblCategoryId.TabIndex = 8;
            lblCategoryId.Text = "Category";
            // 
            // textBox1
            // 
            textBox1.Enabled = false;
            textBox1.Location = new Point(107, 78);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(199, 27);
            textBox1.TabIndex = 9;
            textBox1.TextAlign = HorizontalAlignment.Right;
            // 
            // IdPayMode
            // 
            IdPayMode.HeaderText = "Id";
            IdPayMode.MinimumWidth = 6;
            IdPayMode.Name = "IdPayMode";
            IdPayMode.Resizable = DataGridViewTriState.False;
            IdPayMode.Width = 125;
            // 
            // NamePayMode
            // 
            NamePayMode.HeaderText = "Name";
            NamePayMode.MinimumWidth = 6;
            NamePayMode.Name = "NamePayMode";
            NamePayMode.Resizable = DataGridViewTriState.False;
            NamePayMode.Width = 213;
            // 
            // Price
            // 
            Price.HeaderText = "Price";
            Price.MinimumWidth = 6;
            Price.Name = "Price";
            Price.Width = 150;
            // 
            // Stock
            // 
            Stock.HeaderText = "Stock";
            Stock.MinimumWidth = 6;
            Stock.Name = "Stock";
            Stock.Width = 150;
            // 
            // CategoryId
            // 
            CategoryId.HeaderText = "Category Id";
            CategoryId.MinimumWidth = 6;
            CategoryId.Name = "CategoryId";
            CategoryId.Width = 119;
            // 
            // ProductsForm
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(916, 535);
            Controls.Add(DgProduct);
            Controls.Add(groupBox1);
            Controls.Add(Data);
            Name = "ProductsForm";
            Text = "ProductsForm";
            ((System.ComponentModel.ISupportInitialize)DgProduct).EndInit();
            groupBox1.ResumeLayout(false);
            Data.ResumeLayout(false);
            Data.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private DataGridView DgProduct;
        private GroupBox groupBox1;
        private Button btnClose;
        private Button btnDelete;
        private Button btnEdit;
        private Button btnNew;
        private GroupBox Data;
        private Label lblStock;
        private TextBox txtStock;
        private TextBox txtPrice;
        private Label lblPrice;
        private TextBox txtName;
        private TextBox txtId;
        private Label lblName;
        private Label lblId;
        private Label lblCategoryId;
        private DataGridViewTextBoxColumn IdPayMode;
        private DataGridViewTextBoxColumn NamePayMode;
        private DataGridViewTextBoxColumn Price;
        private DataGridViewTextBoxColumn Stock;
        private DataGridViewTextBoxColumn CategoryId;
        private TextBox textBox1;
    }
}