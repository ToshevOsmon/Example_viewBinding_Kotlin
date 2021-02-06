package com.example.viewbindingexamplekotlin

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.viewbindingexamplekotlin.databinding.FragmentMyBinding
import com.example.viewbindingexamplekotlin.databinding.OpenDialogBinding

class MyFragment : Fragment() {

    private lateinit var binding: FragmentMyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMyBinding.inflate(inflater, container, false)

        binding.openDialog.setOnClickListener {

            openAlterDialog()

        }

        return binding.root
    }

    private lateinit var openDialogBinding: OpenDialogBinding

    private fun openAlterDialog() {

        openDialogBinding = OpenDialogBinding.inflate(LayoutInflater.from(context))

        var builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder.setView(openDialogBinding.root)

        var dialog:AlertDialog = builder.create()

        dialog.show()

        openDialogBinding.cancelBtn.setOnClickListener {
            Toast.makeText(context, "Cancel", Toast.LENGTH_SHORT).show()

            dialog.dismiss()
        }

        openDialogBinding.okBtn.setOnClickListener {
            Toast.makeText(context, "Yes", Toast.LENGTH_SHORT).show()

            dialog.dismiss()
        }

    }


}