namespace Supermarket
{
    partial class Mainform
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
            MainMenu = new MenuStrip();
            FileMenuItem = new ToolStripMenuItem();
            ExitMenuItem = new ToolStripMenuItem();
            MasterMenuItem = new ToolStripMenuItem();
            ProductsMenuItem = new ToolStripMenuItem();
            ProvidersMenuItem = new ToolStripMenuItem();
            CategoriesMenuItem = new ToolStripMenuItem();
            PayModeMenuItem = new ToolStripMenuItem();
            TransactionsMenuItem = new ToolStripMenuItem();
            SellMenuItem = new ToolStripMenuItem();
            PurchaseMenuItem = new ToolStripMenuItem();
            HelpMenuItem = new ToolStripMenuItem();
            AboutMenuItem = new ToolStripMenuItem();
            MainMenu.SuspendLayout();
            SuspendLayout();
            // 
            // MainMenu
            // 
            MainMenu.ImageScalingSize = new Size(20, 20);
            MainMenu.Items.AddRange(new ToolStripItem[] { FileMenuItem, MasterMenuItem, TransactionsMenuItem, HelpMenuItem });
            MainMenu.Location = new Point(0, 0);
            MainMenu.Name = "MainMenu";
            MainMenu.Size = new Size(800, 28);
            MainMenu.TabIndex = 1;
            MainMenu.Text = "menuStrip1";
            // 
            // FileMenuItem
            // 
            FileMenuItem.DropDownItems.AddRange(new ToolStripItem[] { ExitMenuItem });
            FileMenuItem.Name = "FileMenuItem";
            FileMenuItem.Size = new Size(46, 24);
            FileMenuItem.Text = "File";
            // 
            // ExitMenuItem
            // 
            ExitMenuItem.Name = "ExitMenuItem";
            ExitMenuItem.Size = new Size(116, 26);
            ExitMenuItem.Text = "Exit";
            ExitMenuItem.Click += ExitMenuItem_Click;
            // 
            // MasterMenuItem
            // 
            MasterMenuItem.DropDownItems.AddRange(new ToolStripItem[] { ProductsMenuItem, ProvidersMenuItem, CategoriesMenuItem, PayModeMenuItem });
            MasterMenuItem.Name = "MasterMenuItem";
            MasterMenuItem.Size = new Size(68, 24);
            MasterMenuItem.Text = "Master";
            // 
            // ProductsMenuItem
            // 
            ProductsMenuItem.Name = "ProductsMenuItem";
            ProductsMenuItem.Size = new Size(224, 26);
            ProductsMenuItem.Text = "Products";
            //ProductsMenuItem.Click += ProductsMenuItem_Click;
            // 
            // ProvidersMenuItem
            // 
            ProvidersMenuItem.Name = "ProvidersMenuItem";
            ProvidersMenuItem.Size = new Size(224, 26);
            ProvidersMenuItem.Text = "Providers";
            // 
            // CategoriesMenuItem
            // 
            CategoriesMenuItem.Name = "CategoriesMenuItem";
            CategoriesMenuItem.Size = new Size(224, 26);
            CategoriesMenuItem.Text = "Categories";
            // 
            // PayModeMenuItem
            // 
            PayModeMenuItem.Name = "PayModeMenuItem";
            PayModeMenuItem.Size = new Size(224, 26);
            PayModeMenuItem.Text = "PayMode";
            PayModeMenuItem.Click += PayModeMenuItem_Click;
            // 
            // TransactionsMenuItem
            // 
            TransactionsMenuItem.DropDownItems.AddRange(new ToolStripItem[] { SellMenuItem, PurchaseMenuItem });
            TransactionsMenuItem.Name = "TransactionsMenuItem";
            TransactionsMenuItem.Size = new Size(104, 24);
            TransactionsMenuItem.Text = "Transactions";
            // 
            // SellMenuItem
            // 
            SellMenuItem.Name = "SellMenuItem";
            SellMenuItem.Size = new Size(150, 26);
            SellMenuItem.Text = "Sell";
            // 
            // PurchaseMenuItem
            // 
            PurchaseMenuItem.Name = "PurchaseMenuItem";
            PurchaseMenuItem.Size = new Size(150, 26);
            PurchaseMenuItem.Text = "Purchase";
            // 
            // HelpMenuItem
            // 
            HelpMenuItem.DropDownItems.AddRange(new ToolStripItem[] { AboutMenuItem });
            HelpMenuItem.Name = "HelpMenuItem";
            HelpMenuItem.Size = new Size(55, 24);
            HelpMenuItem.Text = "Help";
            // 
            // AboutMenuItem
            // 
            AboutMenuItem.Name = "AboutMenuItem";
            AboutMenuItem.Size = new Size(133, 26);
            AboutMenuItem.Text = "About";
            AboutMenuItem.Click += AboutMenuItem_Click;
            // 
            // Mainform
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(MainMenu);
            IsMdiContainer = true;
            MainMenuStrip = MainMenu;
            Name = "Mainform";
            Text = "Supermarket";
            WindowState = FormWindowState.Maximized;
            MainMenu.ResumeLayout(false);
            MainMenu.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip MainMenu;
        private ToolStripMenuItem FileMenuItem;
        private ToolStripMenuItem ExitMenuItem;
        private ToolStripMenuItem MasterMenuItem;
        private ToolStripMenuItem ProductsMenuItem;
        private ToolStripMenuItem ProvidersMenuItem;
        private ToolStripMenuItem CategoriesMenuItem;
        private ToolStripMenuItem PayModeMenuItem;
        private ToolStripMenuItem TransactionsMenuItem;
        private ToolStripMenuItem SellMenuItem;
        private ToolStripMenuItem PurchaseMenuItem;
        private ToolStripMenuItem HelpMenuItem;
        private ToolStripMenuItem AboutMenuItem;
    }
}