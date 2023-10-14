namespace Supermarket.View
{
    partial class PayModeForm
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
            Data = new GroupBox();
            txtName = new TextBox();
            txtId = new TextBox();
            lblName = new Label();
            lblId = new Label();
            groupBox1 = new GroupBox();
            btnClose = new Button();
            btnDelete = new Button();
            btnEdit = new Button();
            btnNew = new Button();
            DgPayMode = new DataGridView();
            IdPayMode = new DataGridViewTextBoxColumn();
            NamePayMode = new DataGridViewTextBoxColumn();
            Data.SuspendLayout();
            groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)DgPayMode).BeginInit();
            SuspendLayout();
            // 
            // Data
            // 
            Data.Controls.Add(txtName);
            Data.Controls.Add(txtId);
            Data.Controls.Add(lblName);
            Data.Controls.Add(lblId);
            Data.Location = new Point(42, 37);
            Data.Name = "Data";
            Data.Size = new Size(391, 139);
            Data.TabIndex = 0;
            Data.TabStop = false;
            Data.Text = "Data";
            // 
            // txtName
            // 
            txtName.Enabled = false;
            txtName.Location = new Point(107, 82);
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
            lblName.Location = new Point(25, 85);
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
            // groupBox1
            // 
            groupBox1.Controls.Add(btnClose);
            groupBox1.Controls.Add(btnDelete);
            groupBox1.Controls.Add(btnEdit);
            groupBox1.Controls.Add(btnNew);
            groupBox1.Location = new Point(491, 37);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(249, 383);
            groupBox1.TabIndex = 1;
            groupBox1.TabStop = false;
            groupBox1.Text = "Commands";
            // 
            // btnClose
            // 
            btnClose.Image = Properties.Resources.cerrar;
            btnClose.ImageAlign = ContentAlignment.TopCenter;
            btnClose.Location = new Point(68, 292);
            btnClose.Name = "btnClose";
            btnClose.Size = new Size(114, 68);
            btnClose.TabIndex = 3;
            btnClose.Text = "&Close";
            btnClose.TextImageRelation = TextImageRelation.ImageAboveText;
            btnClose.UseVisualStyleBackColor = true;
            btnClose.Click += btnClose_Click;
            // 
            // btnDelete
            // 
            btnDelete.Image = Properties.Resources.delete;
            btnDelete.ImageAlign = ContentAlignment.TopCenter;
            btnDelete.Location = new Point(68, 209);
            btnDelete.Name = "btnDelete";
            btnDelete.Size = new Size(114, 68);
            btnDelete.TabIndex = 2;
            btnDelete.Text = "&Delete";
            btnDelete.TextImageRelation = TextImageRelation.ImageAboveText;
            btnDelete.UseVisualStyleBackColor = true;
            btnDelete.Click += btnDelete_Click;
            // 
            // btnEdit
            // 
            btnEdit.Image = Properties.Resources.edit;
            btnEdit.ImageAlign = ContentAlignment.TopCenter;
            btnEdit.Location = new Point(68, 125);
            btnEdit.Name = "btnEdit";
            btnEdit.Size = new Size(114, 68);
            btnEdit.TabIndex = 1;
            btnEdit.Text = "&Edit";
            btnEdit.TextImageRelation = TextImageRelation.ImageAboveText;
            btnEdit.UseVisualStyleBackColor = true;
            btnEdit.Click += btnEdit_Click;
            // 
            // btnNew
            // 
            btnNew.Image = Properties.Resources._new;
            btnNew.ImageAlign = ContentAlignment.TopCenter;
            btnNew.Location = new Point(68, 42);
            btnNew.Name = "btnNew";
            btnNew.Size = new Size(114, 68);
            btnNew.TabIndex = 0;
            btnNew.Text = "&New";
            btnNew.TextImageRelation = TextImageRelation.ImageAboveText;
            btnNew.UseVisualStyleBackColor = true;
            btnNew.Click += btnNew_Click;
            // 
            // DgPayMode
            // 
            DgPayMode.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            DgPayMode.Columns.AddRange(new DataGridViewColumn[] { IdPayMode, NamePayMode });
            DgPayMode.Location = new Point(42, 202);
            DgPayMode.Name = "DgPayMode";
            DgPayMode.RowHeadersWidth = 51;
            DgPayMode.RowTemplate.Height = 29;
            DgPayMode.Size = new Size(391, 218);
            DgPayMode.TabIndex = 2;
            DgPayMode.Click += DgPayMode_Click;
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
            // PayModeForm
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            ControlBox = false;
            Controls.Add(DgPayMode);
            Controls.Add(groupBox1);
            Controls.Add(Data);
            FormBorderStyle = FormBorderStyle.FixedSingle;
            Name = "PayModeForm";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "Pay Mode Management";
            Data.ResumeLayout(false);
            Data.PerformLayout();
            groupBox1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)DgPayMode).EndInit();
            ResumeLayout(false);
        }

        #endregion

        private GroupBox Data;
        private GroupBox groupBox1;
        private Label lblName;
        private Label lblId;
        private TextBox txtName;
        private TextBox txtId;
        private DataGridView DgPayMode;
        private DataGridViewTextBoxColumn IdPayMode;
        private DataGridViewTextBoxColumn NamePayMode;
        private Button btnNew;
        private Button btnClose;
        private Button btnDelete;
        private Button btnEdit;
    }
}