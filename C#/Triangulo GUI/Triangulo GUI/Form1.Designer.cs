namespace Triangulo_GUI
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            Data = new GroupBox();
            txtArea = new TextBox();
            txtAltura = new TextBox();
            txtBase = new TextBox();
            lblArea = new Label();
            lblAltura = new Label();
            lblBase = new Label();
            groupBox1 = new GroupBox();
            btnCerrar = new Button();
            btnCancelar = new Button();
            btnCalcular = new Button();
            Data.SuspendLayout();
            groupBox1.SuspendLayout();
            SuspendLayout();
            // 
            // Data
            // 
            Data.Controls.Add(txtArea);
            Data.Controls.Add(txtAltura);
            Data.Controls.Add(txtBase);
            Data.Controls.Add(lblArea);
            Data.Controls.Add(lblAltura);
            Data.Controls.Add(lblBase);
            Data.Location = new Point(42, 45);
            Data.Name = "Data";
            Data.Size = new Size(365, 305);
            Data.TabIndex = 0;
            Data.TabStop = false;
            Data.Text = "Datos";
            // 
            // txtArea
            // 
            txtArea.Enabled = false;
            txtArea.Location = new Point(129, 220);
            txtArea.Name = "txtArea";
            txtArea.Size = new Size(176, 27);
            txtArea.TabIndex = 5;
            // 
            // txtAltura
            // 
            txtAltura.Location = new Point(129, 129);
            txtAltura.Name = "txtAltura";
            txtAltura.Size = new Size(176, 27);
            txtAltura.TabIndex = 4;
            // 
            // txtBase
            // 
            txtBase.Location = new Point(129, 46);
            txtBase.Name = "txtBase";
            txtBase.Size = new Size(176, 27);
            txtBase.TabIndex = 3;
            // 
            // lblArea
            // 
            lblArea.AutoSize = true;
            lblArea.Font = new Font("Segoe UI", 13.8F, FontStyle.Regular, GraphicsUnit.Point);
            lblArea.Location = new Point(21, 220);
            lblArea.Name = "lblArea";
            lblArea.Size = new Size(66, 31);
            lblArea.TabIndex = 2;
            lblArea.Text = "Area:";
            // 
            // lblAltura
            // 
            lblAltura.AutoSize = true;
            lblAltura.Font = new Font("Segoe UI", 13.8F, FontStyle.Regular, GraphicsUnit.Point);
            lblAltura.Location = new Point(21, 123);
            lblAltura.Name = "lblAltura";
            lblAltura.Size = new Size(81, 31);
            lblAltura.TabIndex = 1;
            lblAltura.Text = "Altura:";
            // 
            // lblBase
            // 
            lblBase.AutoSize = true;
            lblBase.Font = new Font("Segoe UI", 13.8F, FontStyle.Regular, GraphicsUnit.Point);
            lblBase.Location = new Point(21, 40);
            lblBase.Name = "lblBase";
            lblBase.Size = new Size(66, 31);
            lblBase.TabIndex = 0;
            lblBase.Text = "Base:";
            lblBase.Click += label1_Click;
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(btnCerrar);
            groupBox1.Controls.Add(btnCancelar);
            groupBox1.Controls.Add(btnCalcular);
            groupBox1.Location = new Point(461, 45);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(218, 305);
            groupBox1.TabIndex = 1;
            groupBox1.TabStop = false;
            groupBox1.Text = "Comandos";
            groupBox1.Enter += groupBox1_Enter;
            // 
            // btnCerrar
            // 
            btnCerrar.Location = new Point(38, 219);
            btnCerrar.Name = "btnCerrar";
            btnCerrar.Size = new Size(150, 40);
            btnCerrar.TabIndex = 2;
            btnCerrar.Text = "Cerrar";
            btnCerrar.UseVisualStyleBackColor = true;
            btnCerrar.Click += btnCerrar_Click;
            // 
            // btnCancelar
            // 
            btnCancelar.ForeColor = SystemColors.ControlText;
            btnCancelar.Location = new Point(38, 129);
            btnCancelar.Name = "btnCancelar";
            btnCancelar.Size = new Size(150, 40);
            btnCancelar.TabIndex = 1;
            btnCancelar.Text = "Cancelar";
            btnCancelar.UseVisualStyleBackColor = true;
            // 
            // btnCalcular
            // 
            btnCalcular.Location = new Point(38, 40);
            btnCalcular.Name = "btnCalcular";
            btnCalcular.Size = new Size(150, 40);
            btnCalcular.TabIndex = 0;
            btnCalcular.Text = "Calcular";
            btnCalcular.UseVisualStyleBackColor = true;
            btnCalcular.Click += btnNuevo_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(716, 400);
            Controls.Add(groupBox1);
            Controls.Add(Data);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            Data.ResumeLayout(false);
            Data.PerformLayout();
            groupBox1.ResumeLayout(false);
            ResumeLayout(false);
        }

        #endregion

        private GroupBox Data;
        private TextBox txtArea;
        private TextBox txtAltura;
        private TextBox txtBase;
        private Label lblArea;
        private Label lblAltura;
        private Label lblBase;
        private GroupBox groupBox1;
        private Button btnCerrar;
        private Button btnCancelar;
        private Button btnCalcular;
    }
}